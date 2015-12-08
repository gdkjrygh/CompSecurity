.class public Lcom/google/android/gms/tagmanager/cq$d;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/tagmanager/cq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field private aeU:Ljava/lang/String;

.field private final agZ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/tagmanager/cq$e;",
            ">;"
        }
    .end annotation
.end field

.field private final aha:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/tagmanager/cq$a;",
            ">;>;"
        }
    .end annotation
.end field

.field private ahb:I


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/cq$d;->agZ:Ljava/util/List;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/cq$d;->aha:Ljava/util/Map;

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/cq$d;->aeU:Ljava/lang/String;

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/tagmanager/cq$d;->ahb:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/tagmanager/cq$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/cq$d;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/tagmanager/cq$a;)Lcom/google/android/gms/tagmanager/cq$d;
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/tagmanager/cq$a;->mo()Ljava/util/Map;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/b;->cI:Lcom/google/android/gms/internal/b;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/b;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/d$a;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/dh;->j(Lcom/google/android/gms/internal/d$a;)Ljava/lang/String;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cq$d;->aha:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/cq$d;->aha:Ljava/util/Map;

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public a(Lcom/google/android/gms/tagmanager/cq$e;)Lcom/google/android/gms/tagmanager/cq$d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cq$d;->agZ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public ce(Ljava/lang/String;)Lcom/google/android/gms/tagmanager/cq$d;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/cq$d;->aeU:Ljava/lang/String;

    return-object p0
.end method

.method public du(I)Lcom/google/android/gms/tagmanager/cq$d;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/tagmanager/cq$d;->ahb:I

    return-object p0
.end method

.method public mu()Lcom/google/android/gms/tagmanager/cq$c;
    .locals 6

    new-instance v0, Lcom/google/android/gms/tagmanager/cq$c;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/cq$d;->agZ:Ljava/util/List;

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/cq$d;->aha:Ljava/util/Map;

    iget-object v3, p0, Lcom/google/android/gms/tagmanager/cq$d;->aeU:Ljava/lang/String;

    iget v4, p0, Lcom/google/android/gms/tagmanager/cq$d;->ahb:I

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/tagmanager/cq$c;-><init>(Ljava/util/List;Ljava/util/Map;Ljava/lang/String;ILcom/google/android/gms/tagmanager/cq$1;)V

    return-object v0
.end method
