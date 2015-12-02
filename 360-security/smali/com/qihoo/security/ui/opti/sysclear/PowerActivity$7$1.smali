.class Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$7$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$7;->a(Ljava/util/List;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$7;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$7;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 827
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$7$1;->b:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$7;

    iput-object p2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$7$1;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 830
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$7$1;->b:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$7;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$7;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 831
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$7$1;->b:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$7;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$7;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$7$1;->a:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Ljava/util/List;)V

    .line 841
    :cond_0
    return-void
.end method
