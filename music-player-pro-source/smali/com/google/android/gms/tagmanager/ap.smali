.class Lcom/google/android/gms/tagmanager/ap;
.super Ljava/lang/Object;


# instance fields
.field private final Bv:J

.field private final Bw:J

.field private By:Ljava/lang/String;

.field private final arw:J


# direct methods
.method constructor <init>(JJJ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/google/android/gms/tagmanager/ap;->Bv:J

    iput-wide p3, p0, Lcom/google/android/gms/tagmanager/ap;->Bw:J

    iput-wide p5, p0, Lcom/google/android/gms/tagmanager/ap;->arw:J

    return-void
.end method


# virtual methods
.method ak(Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iput-object p1, p0, Lcom/google/android/gms/tagmanager/ap;->By:Ljava/lang/String;

    goto :goto_0
.end method

.method fb()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/tagmanager/ap;->Bv:J

    return-wide v0
.end method

.method pK()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/tagmanager/ap;->arw:J

    return-wide v0
.end method

.method pL()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/ap;->By:Ljava/lang/String;

    return-object v0
.end method
