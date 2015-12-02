.class public final Lcom/mobvista/sdk/m/core/entity/c;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 9
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/entity/c;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final a(I)V
    .locals 0

    .prologue
    .line 21
    iput p1, p0, Lcom/mobvista/sdk/m/core/entity/c;->b:I

    .line 22
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 13
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/entity/c;->a:Ljava/lang/String;

    .line 14
    return-void
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 17
    iget v0, p0, Lcom/mobvista/sdk/m/core/entity/c;->b:I

    return v0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 29
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/entity/c;->c:Ljava/lang/String;

    .line 30
    return-void
.end method
