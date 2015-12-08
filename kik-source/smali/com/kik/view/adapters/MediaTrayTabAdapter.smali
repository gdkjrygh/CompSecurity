.class public Lcom/kik/view/adapters/MediaTrayTabAdapter;
.super Landroid/support/v4/app/FragmentPagerAdapter;
.source "SourceFile"

# interfaces
.implements Lcom/kik/view/adapters/ai;


# instance fields
.field private a:Ljava/util/LinkedHashMap;

.field private b:Ljava/util/ArrayList;

.field private c:Landroid/view/LayoutInflater;

.field private d:I

.field private e:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/support/v4/app/FragmentManager;)V
    .locals 1

    .prologue
    .line 32
    invoke-direct {p0, p1}, Landroid/support/v4/app/FragmentPagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;)V

    .line 24
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/kik/view/adapters/MediaTrayTabAdapter;->a:Ljava/util/LinkedHashMap;

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kik/view/adapters/MediaTrayTabAdapter;->b:Ljava/util/ArrayList;

    .line 27
    const/4 v0, 0x0

    iput v0, p0, Lcom/kik/view/adapters/MediaTrayTabAdapter;->d:I

    .line 28
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kik/view/adapters/MediaTrayTabAdapter;->e:Ljava/util/ArrayList;

    .line 33
    return-void
.end method


# virtual methods
.method public final a(ILandroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 84
    iget-object v0, p0, Lcom/kik/view/adapters/MediaTrayTabAdapter;->c:Landroid/view/LayoutInflater;

    const v1, 0x7f030080

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lkik/android/widget/TabIconImageView;

    .line 85
    iget-object v1, p0, Lcom/kik/view/adapters/MediaTrayTabAdapter;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lkik/android/widget/TabIconImageView;->setImageResource(I)V

    .line 86
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v1, "AUTOMATION_MEDIA_TRAY_"

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/kik/view/adapters/MediaTrayTabAdapter;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_TAB"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 87
    invoke-static {v0, v1}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    .line 88
    return-object v0
.end method

.method public final a(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/kik/view/adapters/MediaTrayTabAdapter;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 61
    iget-object v0, p0, Lcom/kik/view/adapters/MediaTrayTabAdapter;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 64
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 37
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/view/adapters/MediaTrayTabAdapter;->c:Landroid/view/LayoutInflater;

    .line 38
    return-void
.end method

.method public final a(Ljava/lang/String;ILandroid/support/v4/app/Fragment;)V
    .locals 2

    .prologue
    .line 42
    iget-object v0, p0, Lcom/kik/view/adapters/MediaTrayTabAdapter;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 43
    iget v0, p0, Lcom/kik/view/adapters/MediaTrayTabAdapter;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/kik/view/adapters/MediaTrayTabAdapter;->d:I

    .line 44
    iget-object v0, p0, Lcom/kik/view/adapters/MediaTrayTabAdapter;->e:Ljava/util/ArrayList;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    iget-object v0, p0, Lcom/kik/view/adapters/MediaTrayTabAdapter;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    iget-object v0, p0, Lcom/kik/view/adapters/MediaTrayTabAdapter;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1, p3}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    :cond_0
    return-void
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 78
    iget v0, p0, Lcom/kik/view/adapters/MediaTrayTabAdapter;->d:I

    return v0
.end method

.method public getItem(I)Landroid/support/v4/app/Fragment;
    .locals 2

    .prologue
    .line 55
    iget-object v0, p0, Lcom/kik/view/adapters/MediaTrayTabAdapter;->a:Ljava/util/LinkedHashMap;

    iget-object v1, p0, Lcom/kik/view/adapters/MediaTrayTabAdapter;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    return-object v0
.end method

.method public getPageTitle(I)Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 72
    const-string v0, ""

    return-object v0
.end method
