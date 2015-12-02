.class public final Lcom/mobvista/sdk/m/core/loader/m;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field public static a:I


# instance fields
.field public b:I

.field public c:Ljava/lang/String;

.field public d:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 12
    const/16 v0, 0xc8

    sput v0, Lcom/mobvista/sdk/m/core/loader/m;->a:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 28
    iget v0, p0, Lcom/mobvista/sdk/m/core/loader/m;->b:I

    return v0
.end method

.method public final a(I)V
    .locals 0

    .prologue
    .line 32
    iput p1, p0, Lcom/mobvista/sdk/m/core/loader/m;->b:I

    .line 33
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 40
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/loader/m;->c:Ljava/lang/String;

    .line 41
    return-void
.end method

.method public final a(Ljava/util/List;)V
    .locals 0

    .prologue
    .line 48
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/loader/m;->d:Ljava/util/List;

    .line 49
    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/m;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/util/List;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/m;->d:Ljava/util/List;

    return-object v0
.end method
