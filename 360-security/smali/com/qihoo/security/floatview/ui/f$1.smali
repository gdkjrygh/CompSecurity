.class Lcom/qihoo/security/floatview/ui/f$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/floatview/ui/f;->b()V
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
    .line 164
    iput-object p1, p0, Lcom/qihoo/security/floatview/ui/f$1;->a:Lcom/qihoo/security/floatview/ui/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 167
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f$1;->a:Lcom/qihoo/security/floatview/ui/f;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/qihoo/security/floatview/ui/f;->a(Lcom/qihoo/security/floatview/ui/f;Z)Z

    .line 168
    return-void
.end method
