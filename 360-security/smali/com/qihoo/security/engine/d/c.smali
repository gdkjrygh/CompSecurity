.class public abstract Lcom/qihoo/security/engine/d/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/engine/d/c$a;
    }
.end annotation


# instance fields
.field final a:Lcom/qihoo/security/engine/d/c$a;

.field protected volatile b:Z


# direct methods
.method public constructor <init>(Lcom/qihoo/security/engine/d/c$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/engine/d/c;->b:Z

    iput-object p1, p0, Lcom/qihoo/security/engine/d/c;->a:Lcom/qihoo/security/engine/d/c$a;

    return-void
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract a(Ljava/lang/String;Ljava/lang/String;)I
.end method

.method public abstract b()I
.end method

.method public abstract c()I
.end method

.method public abstract d()I
.end method

.method public abstract e()I
.end method

.method public f()I
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/d/c;->b:Z

    const/4 v0, 0x0

    return v0
.end method

.method public run()V
    .locals 1

    iget-boolean v0, p0, Lcom/qihoo/security/engine/d/c;->b:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/qihoo/security/engine/d/c;->d()I

    iget-object v0, p0, Lcom/qihoo/security/engine/d/c;->a:Lcom/qihoo/security/engine/d/c$a;

    invoke-interface {v0, p0}, Lcom/qihoo/security/engine/d/c$a;->a(Lcom/qihoo/security/engine/d/c;)V

    :cond_0
    return-void
.end method
