.class public final Landroid_src/mms/g/k;
.super Ljava/lang/Object;
.source "PduCacheEntry.java"


# instance fields
.field private final a:Landroid_src/mms/e/f;

.field private final b:I

.field private final c:J


# direct methods
.method public constructor <init>(Landroid_src/mms/e/f;IJ)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Landroid_src/mms/g/k;->a:Landroid_src/mms/e/f;

    .line 29
    iput p2, p0, Landroid_src/mms/g/k;->b:I

    .line 30
    iput-wide p3, p0, Landroid_src/mms/g/k;->c:J

    .line 31
    return-void
.end method


# virtual methods
.method public a()Landroid_src/mms/e/f;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Landroid_src/mms/g/k;->a:Landroid_src/mms/e/f;

    return-object v0
.end method

.method public b()I
    .locals 1

    .prologue
    .line 38
    iget v0, p0, Landroid_src/mms/g/k;->b:I

    return v0
.end method

.method public c()J
    .locals 2

    .prologue
    .line 42
    iget-wide v0, p0, Landroid_src/mms/g/k;->c:J

    return-wide v0
.end method
