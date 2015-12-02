.class public Landroid_src/mms/transaction/b;
.super Landroid_src/mms/transaction/a;
.source "DefaultRetryScheme.java"


# static fields
.field private static final b:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 32
    const/4 v0, 0x5

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Landroid_src/mms/transaction/b;->b:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0xea60
        0x493e0
        0x927c0
        0x1b7740
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 2

    .prologue
    .line 36
    invoke-direct {p0, p2}, Landroid_src/mms/transaction/a;-><init>(I)V

    .line 38
    iget v0, p0, Landroid_src/mms/transaction/b;->a:I

    if-gez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput v0, p0, Landroid_src/mms/transaction/b;->a:I

    .line 39
    iget v0, p0, Landroid_src/mms/transaction/b;->a:I

    sget-object v1, Landroid_src/mms/transaction/b;->b:[I

    array-length v1, v1

    if-lt v0, v1, :cond_1

    sget-object v0, Landroid_src/mms/transaction/b;->b:[I

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    :goto_1
    iput v0, p0, Landroid_src/mms/transaction/b;->a:I

    .line 43
    return-void

    .line 38
    :cond_0
    iget v0, p0, Landroid_src/mms/transaction/b;->a:I

    goto :goto_0

    .line 39
    :cond_1
    iget v0, p0, Landroid_src/mms/transaction/b;->a:I

    goto :goto_1
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 47
    sget-object v0, Landroid_src/mms/transaction/b;->b:[I

    array-length v0, v0

    return v0
.end method

.method public b()J
    .locals 2

    .prologue
    .line 55
    sget-object v0, Landroid_src/mms/transaction/b;->b:[I

    iget v1, p0, Landroid_src/mms/transaction/b;->a:I

    aget v0, v0, v1

    int-to-long v0, v0

    return-wide v0
.end method
