.class public Landroid_src/mms/e/d;
.super Landroid_src/mms/e/f;
.source "DeliveryInd.java"


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 35
    invoke-direct {p0}, Landroid_src/mms/e/f;-><init>()V

    .line 36
    const/16 v0, 0x86

    invoke-virtual {p0, v0}, Landroid_src/mms/e/d;->a(I)V

    .line 37
    return-void
.end method

.method constructor <init>(Landroid_src/mms/e/q;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0, p1}, Landroid_src/mms/e/f;-><init>(Landroid_src/mms/e/q;)V

    .line 46
    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .prologue
    .line 54
    iget-object v0, p0, Landroid_src/mms/e/d;->a:Landroid_src/mms/e/q;

    const/16 v1, 0x85

    invoke-virtual {v0, v1}, Landroid_src/mms/e/q;->e(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public b()[B
    .locals 2

    .prologue
    .line 72
    iget-object v0, p0, Landroid_src/mms/e/d;->a:Landroid_src/mms/e/q;

    const/16 v1, 0x8b

    invoke-virtual {v0, v1}, Landroid_src/mms/e/q;->b(I)[B

    move-result-object v0

    return-object v0
.end method

.method public c()I
    .locals 2

    .prologue
    .line 91
    iget-object v0, p0, Landroid_src/mms/e/d;->a:Landroid_src/mms/e/q;

    const/16 v1, 0x95

    invoke-virtual {v0, v1}, Landroid_src/mms/e/q;->a(I)I

    move-result v0

    return v0
.end method

.method public d()[Landroid_src/mms/e/e;
    .locals 2

    .prologue
    .line 110
    iget-object v0, p0, Landroid_src/mms/e/d;->a:Landroid_src/mms/e/q;

    const/16 v1, 0x97

    invoke-virtual {v0, v1}, Landroid_src/mms/e/q;->d(I)[Landroid_src/mms/e/e;

    move-result-object v0

    return-object v0
.end method
