.class Landroid_src/mms/e/o;
.super Ljava/lang/Object;
.source "PduComposer.java"


# instance fields
.field final synthetic a:Landroid_src/mms/e/k;

.field private b:I

.field private c:I


# direct methods
.method private constructor <init>(Landroid_src/mms/e/k;)V
    .locals 0

    .prologue
    .line 1035
    iput-object p1, p0, Landroid_src/mms/e/o;->a:Landroid_src/mms/e/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroid_src/mms/e/k;Landroid_src/mms/e/l;)V
    .locals 0

    .prologue
    .line 1035
    invoke-direct {p0, p1}, Landroid_src/mms/e/o;-><init>(Landroid_src/mms/e/k;)V

    return-void
.end method

.method static synthetic a(Landroid_src/mms/e/o;I)I
    .locals 0

    .prologue
    .line 1035
    iput p1, p0, Landroid_src/mms/e/o;->b:I

    return p1
.end method

.method static synthetic b(Landroid_src/mms/e/o;I)I
    .locals 0

    .prologue
    .line 1035
    iput p1, p0, Landroid_src/mms/e/o;->c:I

    return p1
.end method


# virtual methods
.method a()I
    .locals 2

    .prologue
    .line 1043
    iget v0, p0, Landroid_src/mms/e/o;->c:I

    iget-object v1, p0, Landroid_src/mms/e/o;->a:Landroid_src/mms/e/k;

    invoke-static {v1}, Landroid_src/mms/e/k;->a(Landroid_src/mms/e/k;)Landroid_src/mms/e/m;

    move-result-object v1

    iget v1, v1, Landroid_src/mms/e/m;->a:I

    if-eq v0, v1, :cond_0

    .line 1044
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "BUG: Invalid call to getLength()"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1047
    :cond_0
    iget-object v0, p0, Landroid_src/mms/e/o;->a:Landroid_src/mms/e/k;

    iget v0, v0, Landroid_src/mms/e/k;->b:I

    iget v1, p0, Landroid_src/mms/e/o;->b:I

    sub-int/2addr v0, v1

    return v0
.end method
