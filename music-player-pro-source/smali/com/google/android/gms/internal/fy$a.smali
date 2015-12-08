.class public final Lcom/google/android/gms/internal/fy$a;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ey;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/fy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final errorCode:I

.field public final lS:Lcom/google/android/gms/internal/ay;

.field public final vD:Lorg/json/JSONObject;

.field public final vE:Lcom/google/android/gms/internal/cr;

.field public final vG:J

.field public final vH:J

.field public final vJ:Lcom/google/android/gms/internal/fh;

.field public final vK:Lcom/google/android/gms/internal/fj;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/fh;Lcom/google/android/gms/internal/fj;Lcom/google/android/gms/internal/cr;Lcom/google/android/gms/internal/ay;IJJLorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/fy$a;->vJ:Lcom/google/android/gms/internal/fh;

    iput-object p2, p0, Lcom/google/android/gms/internal/fy$a;->vK:Lcom/google/android/gms/internal/fj;

    iput-object p3, p0, Lcom/google/android/gms/internal/fy$a;->vE:Lcom/google/android/gms/internal/cr;

    iput-object p4, p0, Lcom/google/android/gms/internal/fy$a;->lS:Lcom/google/android/gms/internal/ay;

    iput p5, p0, Lcom/google/android/gms/internal/fy$a;->errorCode:I

    iput-wide p6, p0, Lcom/google/android/gms/internal/fy$a;->vG:J

    iput-wide p8, p0, Lcom/google/android/gms/internal/fy$a;->vH:J

    iput-object p10, p0, Lcom/google/android/gms/internal/fy$a;->vD:Lorg/json/JSONObject;

    return-void
.end method
