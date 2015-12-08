.class public final Lcom/google/android/gms/internal/am;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final a:Lcom/google/android/gms/internal/t;


# instance fields
.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:Ljava/lang/String;

.field public final l:I

.field public final m:Ljava/lang/String;

.field public final n:I

.field public final o:I

.field public final p:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/t;

    invoke-direct {v0}, Lcom/google/android/gms/internal/t;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/am;->a:Lcom/google/android/gms/internal/t;

    return-void
.end method

.method constructor <init>(IIIIIIIIILjava/lang/String;ILjava/lang/String;IILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/am;->b:I

    iput p2, p0, Lcom/google/android/gms/internal/am;->c:I

    iput p3, p0, Lcom/google/android/gms/internal/am;->d:I

    iput p4, p0, Lcom/google/android/gms/internal/am;->e:I

    iput p5, p0, Lcom/google/android/gms/internal/am;->f:I

    iput p6, p0, Lcom/google/android/gms/internal/am;->g:I

    iput p7, p0, Lcom/google/android/gms/internal/am;->h:I

    iput p8, p0, Lcom/google/android/gms/internal/am;->i:I

    iput p9, p0, Lcom/google/android/gms/internal/am;->j:I

    iput-object p10, p0, Lcom/google/android/gms/internal/am;->k:Ljava/lang/String;

    iput p11, p0, Lcom/google/android/gms/internal/am;->l:I

    iput-object p12, p0, Lcom/google/android/gms/internal/am;->m:Ljava/lang/String;

    iput p13, p0, Lcom/google/android/gms/internal/am;->n:I

    iput p14, p0, Lcom/google/android/gms/internal/am;->o:I

    iput-object p15, p0, Lcom/google/android/gms/internal/am;->p:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/ads/search/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/am;->b:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/a;->a()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/am;->c:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/a;->b()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/am;->d:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/a;->c()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/am;->e:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/a;->d()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/am;->f:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/a;->e()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/am;->g:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/a;->f()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/am;->h:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/a;->g()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/am;->i:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/a;->h()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/am;->j:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/a;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/am;->k:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/a;->j()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/am;->l:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/a;->k()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/am;->m:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/a;->l()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/am;->n:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/a;->m()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/am;->o:I

    invoke-virtual {p1}, Lcom/google/android/gms/ads/search/a;->n()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/am;->p:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/t;->a(Lcom/google/android/gms/internal/am;Landroid/os/Parcel;)V

    return-void
.end method
