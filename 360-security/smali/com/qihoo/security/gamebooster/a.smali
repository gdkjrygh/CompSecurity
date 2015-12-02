.class public Lcom/qihoo/security/gamebooster/a;
.super Lcom/qihoo/security/c/a/a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/qihoo/security/c/a/a",
        "<",
        "Lcom/qihoo/security/c/a;",
        ">;"
    }
.end annotation


# static fields
.field protected static final c:Ljava/lang/String;


# instance fields
.field private final d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/security/c/a;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Landroid/content/pm/PackageManager;

.field private final f:Landroid/content/Context;

.field private g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 25
    const/4 v0, 0x0

    sput-object v0, Lcom/qihoo/security/gamebooster/a;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Landroid/content/pm/PackageManager;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/c/a;",
            ">;",
            "Landroid/content/pm/PackageManager;",
            "Z)V"
        }
    .end annotation

    .prologue
    .line 33
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/c/a/a;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/a;->d:Ljava/util/ArrayList;

    .line 35
    iput-object p3, p0, Lcom/qihoo/security/gamebooster/a;->e:Landroid/content/pm/PackageManager;

    .line 36
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/a;->f:Landroid/content/Context;

    .line 37
    iput-boolean p4, p0, Lcom/qihoo/security/gamebooster/a;->g:Z

    .line 38
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/gamebooster/a;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/a;->d:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic b(Lcom/qihoo/security/gamebooster/a;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/a;->f:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic c(Lcom/qihoo/security/gamebooster/a;)Z
    .locals 1

    .prologue
    .line 24
    iget-boolean v0, p0, Lcom/qihoo/security/gamebooster/a;->g:Z

    return v0
.end method


# virtual methods
.method public a()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/security/c/a;",
            ">;"
        }
    .end annotation

    .prologue
    .line 107
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/a;->d:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 108
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/a;->d:Ljava/util/ArrayList;

    .line 110
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected a(Landroid/view/View;ILandroid/view/ViewGroup;)V
    .locals 6

    .prologue
    .line 47
    const v0, 0x7f0b0074

    invoke-static {p1, v0}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    .line 48
    const v1, 0x7f0b0075

    invoke-static {p1, v1}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 49
    const v2, 0x7f0b0076

    invoke-static {p1, v2}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/qihoo/security/locale/widget/LocaleButton;

    .line 51
    invoke-virtual {p0, p2}, Lcom/qihoo/security/gamebooster/a;->getItem(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/qihoo/security/c/a;

    .line 53
    iget-object v4, v3, Lcom/qihoo/security/c/a;->a:Landroid/content/pm/ApplicationInfo;

    iget-object v5, p0, Lcom/qihoo/security/gamebooster/a;->e:Landroid/content/pm/PackageManager;

    invoke-virtual {v4, v5}, Landroid/content/pm/ApplicationInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 54
    iget-object v1, v3, Lcom/qihoo/security/c/a;->a:Landroid/content/pm/ApplicationInfo;

    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    const v4, 0x7f020044

    invoke-virtual {v0, v1, v4}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->b(Ljava/lang/String;I)V

    .line 55
    iget-boolean v0, v3, Lcom/qihoo/security/c/a;->g:Z

    if-eqz v0, :cond_0

    .line 56
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    const v1, 0x7f0c0091

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/qihoo/security/locale/widget/LocaleButton;->setText(Ljava/lang/CharSequence;)V

    .line 57
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/a;->f:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080055

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/qihoo/security/locale/widget/LocaleButton;->setTextColor(I)V

    .line 58
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/qihoo/security/locale/widget/LocaleButton;->setEnabled(Z)V

    .line 64
    :goto_0
    new-instance v0, Lcom/qihoo/security/gamebooster/a$1;

    invoke-direct {v0, p0, v3, v2}, Lcom/qihoo/security/gamebooster/a$1;-><init>(Lcom/qihoo/security/gamebooster/a;Lcom/qihoo/security/c/a;Lcom/qihoo/security/locale/widget/LocaleButton;)V

    invoke-virtual {v2, v0}, Lcom/qihoo/security/locale/widget/LocaleButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 86
    return-void

    .line 60
    :cond_0
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    const v1, 0x7f0c0090

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/qihoo/security/locale/widget/LocaleButton;->setText(Ljava/lang/CharSequence;)V

    .line 61
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/a;->f:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080056

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/qihoo/security/locale/widget/LocaleButton;->setTextColor(I)V

    .line 62
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/qihoo/security/locale/widget/LocaleButton;->setEnabled(Z)V

    goto :goto_0
.end method

.method public a(Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/security/c/a;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 92
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/a;->a:Ljava/util/List;

    .line 93
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/c/a;

    .line 94
    iget-object v2, v0, Lcom/qihoo/security/c/a;->a:Landroid/content/pm/ApplicationInfo;

    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    const-string/jumbo v3, "com.qihoo.security.lite"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 95
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/a;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 99
    :cond_1
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/a;->notifyDataSetChanged()V

    .line 100
    return-void
.end method

.method protected b()I
    .locals 1

    .prologue
    .line 42
    const v0, 0x7f03001e

    return v0
.end method
