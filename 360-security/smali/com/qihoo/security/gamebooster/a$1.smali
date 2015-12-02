.class Lcom/qihoo/security/gamebooster/a$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/gamebooster/a;->a(Landroid/view/View;ILandroid/view/ViewGroup;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/c/a;

.field final synthetic b:Lcom/qihoo/security/locale/widget/LocaleButton;

.field final synthetic c:Lcom/qihoo/security/gamebooster/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/gamebooster/a;Lcom/qihoo/security/c/a;Lcom/qihoo/security/locale/widget/LocaleButton;)V
    .locals 0

    .prologue
    .line 64
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/a$1;->c:Lcom/qihoo/security/gamebooster/a;

    iput-object p2, p0, Lcom/qihoo/security/gamebooster/a$1;->a:Lcom/qihoo/security/c/a;

    iput-object p3, p0, Lcom/qihoo/security/gamebooster/a$1;->b:Lcom/qihoo/security/locale/widget/LocaleButton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    const/16 v3, 0x2b67

    .line 67
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/a$1;->a:Lcom/qihoo/security/c/a;

    iget-boolean v0, v0, Lcom/qihoo/security/c/a;->g:Z

    if-eqz v0, :cond_0

    .line 84
    :goto_0
    return-void

    .line 70
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/a$1;->a:Lcom/qihoo/security/c/a;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/qihoo/security/c/a;->g:Z

    .line 71
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/a$1;->c:Lcom/qihoo/security/gamebooster/a;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/a;->a(Lcom/qihoo/security/gamebooster/a;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/a$1;->a:Lcom/qihoo/security/c/a;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/a$1;->b:Lcom/qihoo/security/locale/widget/LocaleButton;

    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v1

    const v2, 0x7f0c0091

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleButton;->setText(Ljava/lang/CharSequence;)V

    .line 73
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/a$1;->b:Lcom/qihoo/security/locale/widget/LocaleButton;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/a$1;->c:Lcom/qihoo/security/gamebooster/a;

    invoke-static {v1}, Lcom/qihoo/security/gamebooster/a;->b(Lcom/qihoo/security/gamebooster/a;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f080055

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleButton;->setTextColor(I)V

    .line 74
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/a$1;->b:Lcom/qihoo/security/locale/widget/LocaleButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleButton;->setEnabled(Z)V

    .line 75
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/a$1;->c:Lcom/qihoo/security/gamebooster/a;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/a;->c(Lcom/qihoo/security/gamebooster/a;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 76
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/a$1;->a:Lcom/qihoo/security/c/a;

    iget-object v0, v0, Lcom/qihoo/security/c/a;->a:Landroid/content/pm/ApplicationInfo;

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    const-string/jumbo v1, "1"

    invoke-static {v3, v0, v1}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 82
    :goto_1
    invoke-static {}, Lcom/qihoo/security/gamebooster/b;->a()Lcom/qihoo/security/gamebooster/b;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/a$1;->a:Lcom/qihoo/security/c/a;

    iget-object v1, v1, Lcom/qihoo/security/c/a;->a:Landroid/content/pm/ApplicationInfo;

    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/gamebooster/b;->c(Ljava/lang/String;)V

    goto :goto_0

    .line 79
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/a$1;->a:Lcom/qihoo/security/c/a;

    iget-object v0, v0, Lcom/qihoo/security/c/a;->a:Landroid/content/pm/ApplicationInfo;

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    const-string/jumbo v1, "0"

    invoke-static {v3, v0, v1}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method
