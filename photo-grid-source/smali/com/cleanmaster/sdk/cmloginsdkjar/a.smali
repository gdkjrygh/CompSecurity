.class final Lcom/cleanmaster/sdk/cmloginsdkjar/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:I


# direct methods
.method private constructor <init>(II)V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/a;->a:I

    .line 53
    iput p2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/a;->b:I

    .line 54
    return-void
.end method

.method synthetic constructor <init>(IIB)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0, p1, p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/a;-><init>(II)V

    return-void
.end method


# virtual methods
.method final a(I)Z
    .locals 1

    .prologue
    .line 57
    iget v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/a;->a:I

    if-gt v0, p1, :cond_0

    iget v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/a;->b:I

    if-gt p1, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
