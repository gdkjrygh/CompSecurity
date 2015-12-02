.class public Lcom/qihoo/security/engine/d/b;
.super Ljava/lang/Object;


# instance fields
.field public final a:I

.field public final b:I

.field public c:Lcom/qihoo/security/engine/FileInfo;


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/qihoo/security/engine/d/b;->a:I

    iput p2, p0, Lcom/qihoo/security/engine/d/b;->b:I

    return-void
.end method


# virtual methods
.method public a(I)Lcom/qihoo/security/engine/FileInfo;
    .locals 1

    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/d/b;->c:Lcom/qihoo/security/engine/FileInfo;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/d/b;->c:Lcom/qihoo/security/engine/FileInfo;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/FileInfo;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
