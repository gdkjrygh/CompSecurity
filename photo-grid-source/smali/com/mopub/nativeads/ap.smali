.class final Lcom/mopub/nativeads/ap;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final f:Lcom/mopub/nativeads/ap;
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation
.end field


# instance fields
.field a:Landroid/widget/TextView;

.field b:Landroid/widget/TextView;

.field c:Landroid/widget/TextView;

.field d:Landroid/widget/ImageView;

.field e:Landroid/widget/ImageView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    new-instance v0, Lcom/mopub/nativeads/ap;

    invoke-direct {v0}, Lcom/mopub/nativeads/ap;-><init>()V

    sput-object v0, Lcom/mopub/nativeads/ap;->f:Lcom/mopub/nativeads/ap;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(Landroid/view/View;Lcom/mopub/nativeads/ViewBinder;)Lcom/mopub/nativeads/ap;
    .locals 2

    .prologue
    .line 27
    new-instance v1, Lcom/mopub/nativeads/ap;

    invoke-direct {v1}, Lcom/mopub/nativeads/ap;-><init>()V

    .line 30
    :try_start_0
    iget v0, p1, Lcom/mopub/nativeads/ViewBinder;->b:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/mopub/nativeads/ap;->a:Landroid/widget/TextView;

    .line 31
    iget v0, p1, Lcom/mopub/nativeads/ViewBinder;->c:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/mopub/nativeads/ap;->b:Landroid/widget/TextView;

    .line 32
    iget v0, p1, Lcom/mopub/nativeads/ViewBinder;->d:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/mopub/nativeads/ap;->c:Landroid/widget/TextView;

    .line 33
    iget v0, p1, Lcom/mopub/nativeads/ViewBinder;->e:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/mopub/nativeads/ap;->d:Landroid/widget/ImageView;

    .line 34
    iget v0, p1, Lcom/mopub/nativeads/ViewBinder;->f:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/mopub/nativeads/ap;->e:Landroid/widget/ImageView;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    .line 38
    :goto_0
    return-object v0

    .line 36
    :catch_0
    move-exception v0

    .line 37
    const-string v1, "Could not cast from id in ViewBinder to expected View type"

    invoke-static {v1, v0}, Lcom/mopub/common/logging/MoPubLog;->w(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 38
    sget-object v0, Lcom/mopub/nativeads/ap;->f:Lcom/mopub/nativeads/ap;

    goto :goto_0
.end method

.method static a(Landroid/view/View;Lcom/mopub/nativeads/NativeResponse;Lcom/mopub/nativeads/ViewBinder;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 53
    iget-object v0, p2, Lcom/mopub/nativeads/ViewBinder;->g:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 54
    iget-object v1, p2, Lcom/mopub/nativeads/ViewBinder;->g:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 55
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 56
    invoke-virtual {p1, v0}, Lcom/mopub/nativeads/NativeResponse;->getExtra(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 58
    instance-of v4, v2, Landroid/widget/ImageView;

    if-eqz v4, :cond_1

    move-object v1, v2

    .line 60
    check-cast v1, Landroid/widget/ImageView;

    invoke-virtual {v1, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 61
    check-cast v2, Landroid/widget/ImageView;

    invoke-virtual {p1, v0, v2}, Lcom/mopub/nativeads/NativeResponse;->loadExtrasImage(Ljava/lang/String;Landroid/widget/ImageView;)V

    goto :goto_0

    .line 62
    :cond_1
    instance-of v4, v2, Landroid/widget/TextView;

    if-eqz v4, :cond_2

    move-object v0, v2

    .line 64
    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 65
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 66
    check-cast v2, Landroid/widget/TextView;

    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    invoke-static {v2, v0}, Lcom/mopub/nativeads/ap;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    goto :goto_0

    .line 69
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "View bound to "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " should be an instance of TextView or ImageView."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 72
    :cond_3
    return-void
.end method

.method private static a(Landroid/widget/TextView;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 75
    if-nez p0, :cond_0

    .line 76
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Attempted to add text ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ") to null TextView."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 88
    :goto_0
    return-void

    .line 81
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    if-nez p1, :cond_1

    .line 84
    const-string v0, "Attempted to set TextView contents to null."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 86
    :cond_1
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method


# virtual methods
.method final a(Lcom/mopub/nativeads/NativeResponse;)V
    .locals 2

    .prologue
    .line 43
    iget-object v0, p0, Lcom/mopub/nativeads/ap;->a:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/mopub/nativeads/NativeResponse;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mopub/nativeads/ap;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 44
    iget-object v0, p0, Lcom/mopub/nativeads/ap;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/mopub/nativeads/NativeResponse;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mopub/nativeads/ap;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 45
    iget-object v0, p0, Lcom/mopub/nativeads/ap;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/mopub/nativeads/NativeResponse;->getCallToAction()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mopub/nativeads/ap;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 46
    iget-object v0, p0, Lcom/mopub/nativeads/ap;->d:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Lcom/mopub/nativeads/NativeResponse;->loadMainImage(Landroid/widget/ImageView;)V

    .line 47
    iget-object v0, p0, Lcom/mopub/nativeads/ap;->e:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Lcom/mopub/nativeads/NativeResponse;->loadIconImage(Landroid/widget/ImageView;)V

    .line 48
    return-void
.end method
