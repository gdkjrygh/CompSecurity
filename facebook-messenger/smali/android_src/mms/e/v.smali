.class public Landroid_src/mms/e/v;
.super Landroid_src/mms/e/f;
.source "ReadOrigInd.java"


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 32
    invoke-direct {p0}, Landroid_src/mms/e/f;-><init>()V

    .line 33
    const/16 v0, 0x88

    invoke-virtual {p0, v0}, Landroid_src/mms/e/v;->a(I)V

    .line 34
    return-void
.end method

.method constructor <init>(Landroid_src/mms/e/q;)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0, p1}, Landroid_src/mms/e/f;-><init>(Landroid_src/mms/e/q;)V

    .line 43
    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .prologue
    .line 51
    iget-object v0, p0, Landroid_src/mms/e/v;->a:Landroid_src/mms/e/q;

    const/16 v1, 0x85

    invoke-virtual {v0, v1}, Landroid_src/mms/e/q;->e(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public a(Landroid_src/mms/e/e;)V
    .locals 2

    .prologue
    .line 81
    iget-object v0, p0, Landroid_src/mms/e/v;->a:Landroid_src/mms/e/q;

    const/16 v1, 0x89

    invoke-virtual {v0, p1, v1}, Landroid_src/mms/e/q;->a(Landroid_src/mms/e/e;I)V

    .line 82
    return-void
.end method

.method public b()[B
    .locals 2

    .prologue
    .line 90
    iget-object v0, p0, Landroid_src/mms/e/v;->a:Landroid_src/mms/e/q;

    const/16 v1, 0x8b

    invoke-virtual {v0, v1}, Landroid_src/mms/e/q;->b(I)[B

    move-result-object v0

    return-object v0
.end method

.method public c()I
    .locals 2

    .prologue
    .line 109
    iget-object v0, p0, Landroid_src/mms/e/v;->a:Landroid_src/mms/e/q;

    const/16 v1, 0x9b

    invoke-virtual {v0, v1}, Landroid_src/mms/e/q;->a(I)I

    move-result v0

    return v0
.end method

.method public d()[Landroid_src/mms/e/e;
    .locals 2

    .prologue
    .line 128
    iget-object v0, p0, Landroid_src/mms/e/v;->a:Landroid_src/mms/e/q;

    const/16 v1, 0x97

    invoke-virtual {v0, v1}, Landroid_src/mms/e/q;->d(I)[Landroid_src/mms/e/e;

    move-result-object v0

    return-object v0
.end method

.method public h()Landroid_src/mms/e/e;
    .locals 2

    .prologue
    .line 71
    iget-object v0, p0, Landroid_src/mms/e/v;->a:Landroid_src/mms/e/q;

    const/16 v1, 0x89

    invoke-virtual {v0, v1}, Landroid_src/mms/e/q;->c(I)Landroid_src/mms/e/e;

    move-result-object v0

    return-object v0
.end method
