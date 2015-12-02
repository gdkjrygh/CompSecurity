.class Lcom/qihoo/security/widget/a$4;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/widget/a;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/widget/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/widget/a;)V
    .locals 0

    .prologue
    .line 470
    iput-object p1, p0, Lcom/qihoo/security/widget/a$4;->a:Lcom/qihoo/security/widget/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 474
    iget-object v0, p0, Lcom/qihoo/security/widget/a$4;->a:Lcom/qihoo/security/widget/a;

    iget-object v1, p0, Lcom/qihoo/security/widget/a$4;->a:Lcom/qihoo/security/widget/a;

    invoke-static {v1}, Lcom/qihoo/security/widget/a;->k(Lcom/qihoo/security/widget/a;)Landroid/content/Context;

    move-result-object v1

    const-string/jumbo v2, "flsm.list"

    const-string/jumbo v3, "com.qihoo.security.lite"

    invoke-static {v1, v2, v3}, Lcom/qihoo360/common/utils/Utils;->openConfigFileDescrypt(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/widget/a;->a(Lcom/qihoo/security/widget/a;Ljava/util/List;)Ljava/util/List;

    .line 476
    return-void
.end method
