.class public Landroid_src/mms/e/y;
.super Landroid_src/mms/e/f;
.source "SendConf.java"


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 32
    invoke-direct {p0}, Landroid_src/mms/e/f;-><init>()V

    .line 33
    const/16 v0, 0x81

    invoke-virtual {p0, v0}, Landroid_src/mms/e/y;->a(I)V

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
.method public a()[B
    .locals 2

    .prologue
    .line 51
    iget-object v0, p0, Landroid_src/mms/e/y;->a:Landroid_src/mms/e/q;

    const/16 v1, 0x8b

    invoke-virtual {v0, v1}, Landroid_src/mms/e/q;->b(I)[B

    move-result-object v0

    return-object v0
.end method

.method public b()I
    .locals 2

    .prologue
    .line 70
    iget-object v0, p0, Landroid_src/mms/e/y;->a:Landroid_src/mms/e/q;

    const/16 v1, 0x92

    invoke-virtual {v0, v1}, Landroid_src/mms/e/q;->a(I)I

    move-result v0

    return v0
.end method

.method public c()[B
    .locals 2

    .prologue
    .line 89
    iget-object v0, p0, Landroid_src/mms/e/y;->a:Landroid_src/mms/e/q;

    const/16 v1, 0x98

    invoke-virtual {v0, v1}, Landroid_src/mms/e/q;->b(I)[B

    move-result-object v0

    return-object v0
.end method
