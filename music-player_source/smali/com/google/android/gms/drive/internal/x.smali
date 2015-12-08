.class public final Lcom/google/android/gms/drive/internal/x;
.super Lcom/google/android/gms/internal/kv;


# static fields
.field public static final a:[Lcom/google/android/gms/drive/internal/x;


# instance fields
.field public b:I

.field public c:Ljava/lang/String;

.field public d:J

.field public e:J

.field private f:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Lcom/google/android/gms/drive/internal/x;

    sput-object v0, Lcom/google/android/gms/drive/internal/x;->a:[Lcom/google/android/gms/drive/internal/x;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    const-wide/16 v2, -0x1

    invoke-direct {p0}, Lcom/google/android/gms/internal/kv;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/drive/internal/x;->b:I

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/drive/internal/x;->c:Ljava/lang/String;

    iput-wide v2, p0, Lcom/google/android/gms/drive/internal/x;->d:J

    iput-wide v2, p0, Lcom/google/android/gms/drive/internal/x;->e:J

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/drive/internal/x;->f:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/drive/internal/x;->f:I

    if-gez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/x;->b()I

    :cond_0
    iget v0, p0, Lcom/google/android/gms/drive/internal/x;->f:I

    return v0
.end method

.method public final a(Lcom/google/android/gms/internal/kp;)V
    .locals 4

    const/4 v0, 0x1

    iget v1, p0, Lcom/google/android/gms/drive/internal/x;->b:I

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/kp;->a(II)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/google/android/gms/drive/internal/x;->c:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/kp;->a(ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-wide v2, p0, Lcom/google/android/gms/drive/internal/x;->d:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/internal/kp;->b(IJ)V

    const/4 v0, 0x4

    iget-wide v2, p0, Lcom/google/android/gms/drive/internal/x;->e:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/internal/kp;->b(IJ)V

    return-void
.end method

.method public final b()I
    .locals 4

    iget v0, p0, Lcom/google/android/gms/drive/internal/x;->b:I

    invoke-static {v0}, Lcom/google/android/gms/internal/kp;->a(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/x;->c:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/kp;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x3

    iget-wide v2, p0, Lcom/google/android/gms/drive/internal/x;->d:J

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/kp;->c(IJ)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x4

    iget-wide v2, p0, Lcom/google/android/gms/drive/internal/x;->e:J

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/kp;->c(IJ)I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/drive/internal/x;->f:I

    return v0
.end method
