.class Lcom/qihoo/security/floatview/ui/f$7;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/floatview/ui/f;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/floatview/ui/f;


# direct methods
.method constructor <init>(Lcom/qihoo/security/floatview/ui/f;)V
    .locals 0

    .prologue
    .line 657
    iput-object p1, p0, Lcom/qihoo/security/floatview/ui/f$7;->a:Lcom/qihoo/security/floatview/ui/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 662
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f$7;->a:Lcom/qihoo/security/floatview/ui/f;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/floatview/ui/f;->d(Lcom/qihoo/security/floatview/ui/f;Z)V

    .line 663
    return-void
.end method
