.class final Lcom/google/android/gms/tagmanager/ad;
.super Ljava/lang/Object;


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Z


# direct methods
.method constructor <init>(Ljava/lang/Object;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/ad;->a:Ljava/lang/Object;

    iput-boolean p2, p0, Lcom/google/android/gms/tagmanager/ad;->b:Z

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/ad;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/ad;->b:Z

    return v0
.end method
