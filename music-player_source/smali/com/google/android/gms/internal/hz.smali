.class public final Lcom/google/android/gms/internal/hz;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final a:Lcom/google/android/gms/internal/ji;


# instance fields
.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ji;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ji;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/hz;->a:Lcom/google/android/gms/internal/ji;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/hz;->b:I

    iput-object p2, p0, Lcom/google/android/gms/internal/hz;->c:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/hz;->d:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/hz;->e:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/hz;->f:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/internal/hz;->g:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/hz;->a:Lcom/google/android/gms/internal/ji;

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p0, p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/internal/hz;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/internal/hz;

    iget-object v2, p0, Lcom/google/android/gms/internal/hz;->c:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/hz;->c:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/gq;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/internal/hz;->d:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/hz;->d:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/gq;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/internal/hz;->e:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/hz;->e:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/gq;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/internal/hz;->f:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/hz;->f:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/gq;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/internal/hz;->g:Ljava/util/List;

    iget-object v3, p1, Lcom/google/android/gms/internal/hz;->g:Ljava/util/List;

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/gq;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/internal/hz;->c:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/android/gms/internal/hz;->d:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/internal/hz;->e:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/android/gms/internal/hz;->f:Ljava/lang/String;

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/internal/gq;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/gr;

    move-result-object v0

    const-string v1, "name"

    iget-object v2, p0, Lcom/google/android/gms/internal/hz;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/gr;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/gr;

    move-result-object v0

    const-string v1, "address"

    iget-object v2, p0, Lcom/google/android/gms/internal/hz;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/gr;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/gr;

    move-result-object v0

    const-string v1, "internationalPhoneNumber"

    iget-object v2, p0, Lcom/google/android/gms/internal/hz;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/gr;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/gr;

    move-result-object v0

    const-string v1, "regularOpenHours"

    iget-object v2, p0, Lcom/google/android/gms/internal/hz;->f:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/gr;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/gr;

    move-result-object v0

    const-string v1, "attributions"

    iget-object v2, p0, Lcom/google/android/gms/internal/hz;->g:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/gr;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/gr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gr;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/hz;->a:Lcom/google/android/gms/internal/ji;

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ji;->a(Lcom/google/android/gms/internal/hz;Landroid/os/Parcel;)V

    return-void
.end method
