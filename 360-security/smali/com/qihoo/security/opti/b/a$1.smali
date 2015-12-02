.class final Lcom/qihoo/security/opti/b/a$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/opti/b/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 38
    invoke-static {}, Lcom/qihoo/security/opti/b/b;->a()Lcom/qihoo/security/opti/b/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/opti/b/b;->b()V

    .line 39
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 43
    invoke-static {}, Lcom/qihoo/security/opti/b/b;->a()Lcom/qihoo/security/opti/b/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/opti/b/b;->c()V

    .line 44
    return-void
.end method
