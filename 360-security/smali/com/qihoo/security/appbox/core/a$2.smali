.class Lcom/qihoo/security/appbox/core/a$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/appbox/core/a;->a(Lcom/qihoo/security/appbox/b/c;Lcom/qihoo/security/appbox/core/AppBoxResponse;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/appbox/b/c;

.field final synthetic b:Lcom/qihoo/security/appbox/core/AppBoxResponse;

.field final synthetic c:Lcom/qihoo/security/appbox/core/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/appbox/core/a;Lcom/qihoo/security/appbox/b/c;Lcom/qihoo/security/appbox/core/AppBoxResponse;)V
    .locals 0

    .prologue
    .line 338
    iput-object p1, p0, Lcom/qihoo/security/appbox/core/a$2;->c:Lcom/qihoo/security/appbox/core/a;

    iput-object p2, p0, Lcom/qihoo/security/appbox/core/a$2;->a:Lcom/qihoo/security/appbox/b/c;

    iput-object p3, p0, Lcom/qihoo/security/appbox/core/a$2;->b:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 342
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a$2;->a:Lcom/qihoo/security/appbox/b/c;

    iget-object v1, p0, Lcom/qihoo/security/appbox/core/a$2;->b:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    invoke-interface {v0, v1}, Lcom/qihoo/security/appbox/b/c;->a(Lcom/qihoo/security/appbox/core/AppBoxResponse;)V

    .line 343
    return-void
.end method
