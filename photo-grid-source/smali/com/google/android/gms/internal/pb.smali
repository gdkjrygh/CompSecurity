.class public final Lcom/google/android/gms/internal/pb;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# instance fields
.field public final a:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

.field public final b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

.field public final c:Lcom/google/android/gms/internal/ie;

.field public final d:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

.field public final e:I

.field public final f:J

.field public final g:J

.field public final h:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Lcom/google/android/gms/ads/internal/request/AdResponseParcel;Lcom/google/android/gms/internal/ie;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;IJJLorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/pb;->a:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

    iput-object p2, p0, Lcom/google/android/gms/internal/pb;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iput-object p3, p0, Lcom/google/android/gms/internal/pb;->c:Lcom/google/android/gms/internal/ie;

    iput-object p4, p0, Lcom/google/android/gms/internal/pb;->d:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iput p5, p0, Lcom/google/android/gms/internal/pb;->e:I

    iput-wide p6, p0, Lcom/google/android/gms/internal/pb;->f:J

    iput-wide p8, p0, Lcom/google/android/gms/internal/pb;->g:J

    iput-object p10, p0, Lcom/google/android/gms/internal/pb;->h:Lorg/json/JSONObject;

    return-void
.end method
