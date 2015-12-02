.class public Landroid_src/mms/e/g;
.super Landroid_src/mms/e/f;
.source "MultimediaMessagePdu.java"


# instance fields
.field private b:Landroid_src/mms/e/j;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Landroid_src/mms/e/f;-><init>()V

    .line 36
    return-void
.end method

.method public constructor <init>(Landroid_src/mms/e/q;Landroid_src/mms/e/j;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0, p1}, Landroid_src/mms/e/f;-><init>(Landroid_src/mms/e/q;)V

    .line 46
    iput-object p2, p0, Landroid_src/mms/e/g;->b:Landroid_src/mms/e/j;

    .line 47
    return-void
.end method


# virtual methods
.method public a()Landroid_src/mms/e/j;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Landroid_src/mms/e/g;->b:Landroid_src/mms/e/j;

    return-object v0
.end method

.method public a(J)V
    .locals 2

    .prologue
    .line 148
    iget-object v0, p0, Landroid_src/mms/e/g;->a:Landroid_src/mms/e/q;

    const/16 v1, 0x85

    invoke-virtual {v0, p1, p2, v1}, Landroid_src/mms/e/q;->a(JI)V

    .line 149
    return-void
.end method

.method public a(Landroid_src/mms/e/j;)V
    .locals 0

    .prologue
    .line 73
    iput-object p1, p0, Landroid_src/mms/e/g;->b:Landroid_src/mms/e/j;

    .line 74
    return-void
.end method

.method public c(I)V
    .locals 2

    .prologue
    .line 130
    iget-object v0, p0, Landroid_src/mms/e/g;->a:Landroid_src/mms/e/q;

    const/16 v1, 0x8f

    invoke-virtual {v0, p1, v1}, Landroid_src/mms/e/q;->a(II)V

    .line 131
    return-void
.end method
