.class Lcom/qihoo/security/notify/c$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/notify/c;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/notify/c;


# direct methods
.method constructor <init>(Lcom/qihoo/security/notify/c;)V
    .locals 0

    .prologue
    .line 336
    iput-object p1, p0, Lcom/qihoo/security/notify/c$2;->a:Lcom/qihoo/security/notify/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 339
    iget-object v0, p0, Lcom/qihoo/security/notify/c$2;->a:Lcom/qihoo/security/notify/c;

    invoke-static {v0}, Lcom/qihoo/security/notify/c;->a(Lcom/qihoo/security/notify/c;)V

    .line 340
    return-void
.end method
