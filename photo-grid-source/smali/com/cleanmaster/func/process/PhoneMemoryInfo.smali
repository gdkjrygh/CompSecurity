.class public Lcom/cleanmaster/func/process/PhoneMemoryInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/cleanmaster/func/process/IPhoneMemoryInfo;


# instance fields
.field a:J

.field b:J

.field c:I

.field d:I

.field e:J


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 1

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/cleanmaster/func/process/PhoneMemoryInfo;->a(JJ)V

    .line 15
    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .prologue
    .line 47
    iget-wide v0, p0, Lcom/cleanmaster/func/process/PhoneMemoryInfo;->a:J

    return-wide v0
.end method

.method public a(JJ)V
    .locals 5

    .prologue
    .line 19
    iput-wide p1, p0, Lcom/cleanmaster/func/process/PhoneMemoryInfo;->e:J

    .line 20
    iput-wide p3, p0, Lcom/cleanmaster/func/process/PhoneMemoryInfo;->a:J

    .line 22
    const/4 v0, 0x1

    iput v0, p0, Lcom/cleanmaster/func/process/PhoneMemoryInfo;->d:I

    .line 23
    iput-wide p1, p0, Lcom/cleanmaster/func/process/PhoneMemoryInfo;->b:J

    .line 25
    const-wide/16 v0, 0x0

    iget-wide v2, p0, Lcom/cleanmaster/func/process/PhoneMemoryInfo;->a:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 26
    iget-wide v0, p0, Lcom/cleanmaster/func/process/PhoneMemoryInfo;->a:J

    iget-wide v2, p0, Lcom/cleanmaster/func/process/PhoneMemoryInfo;->b:J

    sub-long/2addr v0, v2

    long-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float/2addr v0, v1

    iget-wide v2, p0, Lcom/cleanmaster/func/process/PhoneMemoryInfo;->a:J

    long-to-float v1, v2

    div-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/cleanmaster/func/process/PhoneMemoryInfo;->c:I

    .line 30
    :goto_0
    return-void

    .line 28
    :cond_0
    const/16 v0, 0x55

    iput v0, p0, Lcom/cleanmaster/func/process/PhoneMemoryInfo;->c:I

    goto :goto_0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 35
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .prologue
    .line 63
    iget-wide v0, p0, Lcom/cleanmaster/func/process/PhoneMemoryInfo;->a:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 64
    iget-wide v0, p0, Lcom/cleanmaster/func/process/PhoneMemoryInfo;->b:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 65
    iget v0, p0, Lcom/cleanmaster/func/process/PhoneMemoryInfo;->c:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 66
    iget v0, p0, Lcom/cleanmaster/func/process/PhoneMemoryInfo;->d:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 67
    iget-wide v0, p0, Lcom/cleanmaster/func/process/PhoneMemoryInfo;->e:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 68
    return-void
.end method
