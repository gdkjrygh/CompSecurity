.class Lcom/qihoo/security/ui/main/HomeActivity$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/main/HomeActivity;->A()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/main/HomeActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/main/HomeActivity;)V
    .locals 0

    .prologue
    .line 1242
    iput-object p1, p0, Lcom/qihoo/security/ui/main/HomeActivity$2;->a:Lcom/qihoo/security/ui/main/HomeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 1246
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity$2;->a:Lcom/qihoo/security/ui/main/HomeActivity;

    iget-object v0, v0, Lcom/qihoo/security/ui/main/HomeActivity;->p:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/locale/language/b;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1263
    :cond_0
    :goto_0
    return-void

    .line 1251
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity$2;->a:Lcom/qihoo/security/ui/main/HomeActivity;

    iget-object v0, v0, Lcom/qihoo/security/ui/main/HomeActivity;->p:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/o;->g(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1255
    invoke-static {}, Lcom/qihoo/security/appbox/core/a;->a()Lcom/qihoo/security/appbox/core/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/core/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1258
    invoke-static {}, Lcom/qihoo/security/appbox/core/a;->a()Lcom/qihoo/security/appbox/core/a;

    move-result-object v0

    invoke-static {}, Lcom/qihoo/security/appbox/core/a;->a()Lcom/qihoo/security/appbox/core/a;

    move-result-object v1

    const-string/jumbo v2, "3"

    invoke-virtual {v1, v2}, Lcom/qihoo/security/appbox/core/a;->a(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    const-string/jumbo v2, "3"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/appbox/core/a;->a(Ljava/util/ArrayList;Ljava/lang/String;Lcom/qihoo/security/appbox/b/c;)V

    goto :goto_0
.end method
