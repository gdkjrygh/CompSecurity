.class Lcom/qihoo/security/appbox/core/a$7$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/appbox/core/a$7;->a(Lorg/json/JSONObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/appbox/core/AppBoxResponse;

.field final synthetic b:Lcom/qihoo/security/appbox/core/a$7;


# direct methods
.method constructor <init>(Lcom/qihoo/security/appbox/core/a$7;Lcom/qihoo/security/appbox/core/AppBoxResponse;)V
    .locals 0

    .prologue
    .line 636
    iput-object p1, p0, Lcom/qihoo/security/appbox/core/a$7$1;->b:Lcom/qihoo/security/appbox/core/a$7;

    iput-object p2, p0, Lcom/qihoo/security/appbox/core/a$7$1;->a:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 639
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a$7$1;->b:Lcom/qihoo/security/appbox/core/a$7;

    iget-object v0, v0, Lcom/qihoo/security/appbox/core/a$7;->h:Lcom/qihoo/security/appbox/core/a;

    iget-object v1, p0, Lcom/qihoo/security/appbox/core/a$7$1;->a:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    iget-object v2, p0, Lcom/qihoo/security/appbox/core/a$7$1;->b:Lcom/qihoo/security/appbox/core/a$7;

    iget-object v2, v2, Lcom/qihoo/security/appbox/core/a$7;->e:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/appbox/core/a;->b(Lcom/qihoo/security/appbox/core/a;Lcom/qihoo/security/appbox/core/AppBoxResponse;Ljava/lang/String;)V

    .line 640
    return-void
.end method
