.class Lcom/qihoo/security/enginehelper/clean/a$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/enginehelper/clean/a;->a(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/qihoo/security/enginehelper/clean/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/enginehelper/clean/a;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 251
    iput-object p1, p0, Lcom/qihoo/security/enginehelper/clean/a$2;->b:Lcom/qihoo/security/enginehelper/clean/a;

    iput-object p2, p0, Lcom/qihoo/security/enginehelper/clean/a$2;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 255
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$2;->b:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->b(Lcom/qihoo/security/enginehelper/clean/a;)V

    .line 256
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$2;->b:Lcom/qihoo/security/enginehelper/clean/a;

    const/16 v1, 0x1f

    invoke-static {v0, v1}, Lcom/qihoo/security/enginehelper/clean/a;->c(Lcom/qihoo/security/enginehelper/clean/a;I)I

    .line 257
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$2;->b:Lcom/qihoo/security/enginehelper/clean/a;

    iget-object v1, p0, Lcom/qihoo/security/enginehelper/clean/a$2;->a:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/qihoo/security/enginehelper/clean/a;->a(Lcom/qihoo/security/enginehelper/clean/a;Ljava/util/List;)Ljava/util/List;

    .line 258
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$2;->b:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->a(Lcom/qihoo/security/enginehelper/clean/a;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 259
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$2;->b:Lcom/qihoo/security/enginehelper/clean/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/enginehelper/clean/a;->c(Lcom/qihoo/security/enginehelper/clean/a;I)I

    .line 260
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$2;->b:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->g(Lcom/qihoo/security/enginehelper/clean/a;)V

    .line 262
    :cond_0
    return-void
.end method
