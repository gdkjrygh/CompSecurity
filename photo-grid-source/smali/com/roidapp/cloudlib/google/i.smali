.class public final Lcom/roidapp/cloudlib/google/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/cloudlib/google/i;->c:I

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 8
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/i;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final a(I)V
    .locals 0

    .prologue
    .line 18
    iput p1, p0, Lcom/roidapp/cloudlib/google/i;->c:I

    .line 19
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 11
    iput-object p1, p0, Lcom/roidapp/cloudlib/google/i;->b:Ljava/lang/String;

    .line 12
    return-void
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 15
    iget v0, p0, Lcom/roidapp/cloudlib/google/i;->c:I

    return v0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 30
    iput-object p1, p0, Lcom/roidapp/cloudlib/google/i;->a:Ljava/lang/String;

    .line 31
    return-void
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/i;->a:Ljava/lang/String;

    return-object v0
.end method
