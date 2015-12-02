.class public Landroid_src/mms/e/j;
.super Ljava/lang/Object;
.source "PduBody.java"


# instance fields
.field private a:Ljava/util/Vector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Vector",
            "<",
            "Landroid_src/mms/e/s;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Landroid_src/mms/e/s;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Landroid_src/mms/e/s;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Landroid_src/mms/e/s;",
            ">;"
        }
    .end annotation
.end field

.field private e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Landroid_src/mms/e/s;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object v0, p0, Landroid_src/mms/e/j;->a:Ljava/util/Vector;

    .line 27
    iput-object v0, p0, Landroid_src/mms/e/j;->b:Ljava/util/Map;

    .line 28
    iput-object v0, p0, Landroid_src/mms/e/j;->c:Ljava/util/Map;

    .line 29
    iput-object v0, p0, Landroid_src/mms/e/j;->d:Ljava/util/Map;

    .line 30
    iput-object v0, p0, Landroid_src/mms/e/j;->e:Ljava/util/Map;

    .line 36
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Landroid_src/mms/e/j;->a:Ljava/util/Vector;

    .line 38
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroid_src/mms/e/j;->b:Ljava/util/Map;

    .line 39
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroid_src/mms/e/j;->c:Ljava/util/Map;

    .line 40
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroid_src/mms/e/j;->d:Ljava/util/Map;

    .line 41
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroid_src/mms/e/j;->e:Ljava/util/Map;

    .line 42
    return-void
.end method

.method private b(Landroid_src/mms/e/s;)V
    .locals 3

    .prologue
    .line 46
    invoke-virtual {p1}, Landroid_src/mms/e/s;->c()[B

    move-result-object v0

    .line 47
    if-eqz v0, :cond_0

    .line 48
    iget-object v1, p0, Landroid_src/mms/e/j;->b:Ljava/util/Map;

    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v0}, Ljava/lang/String;-><init>([B)V

    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    :cond_0
    invoke-virtual {p1}, Landroid_src/mms/e/s;->e()[B

    move-result-object v0

    .line 53
    if-eqz v0, :cond_1

    .line 54
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    .line 55
    iget-object v0, p0, Landroid_src/mms/e/j;->c:Ljava/util/Map;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    :cond_1
    invoke-virtual {p1}, Landroid_src/mms/e/s;->i()[B

    move-result-object v0

    .line 60
    if-eqz v0, :cond_2

    .line 61
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    .line 62
    iget-object v0, p0, Landroid_src/mms/e/j;->d:Ljava/util/Map;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    :cond_2
    invoke-virtual {p1}, Landroid_src/mms/e/s;->j()[B

    move-result-object v0

    .line 67
    if-eqz v0, :cond_3

    .line 68
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    .line 69
    iget-object v0, p0, Landroid_src/mms/e/j;->e:Ljava/util/Map;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    :cond_3
    return-void
.end method


# virtual methods
.method public a(I)Landroid_src/mms/e/s;
    .locals 1

    .prologue
    .line 129
    iget-object v0, p0, Landroid_src/mms/e/j;->a:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid_src/mms/e/s;

    return-object v0
.end method

.method public a()V
    .locals 1

    .prologue
    .line 119
    iget-object v0, p0, Landroid_src/mms/e/j;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->clear()V

    .line 120
    return-void
.end method

.method public a(ILandroid_src/mms/e/s;)V
    .locals 1

    .prologue
    .line 97
    if-nez p2, :cond_0

    .line 98
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 101
    :cond_0
    invoke-direct {p0, p2}, Landroid_src/mms/e/j;->b(Landroid_src/mms/e/s;)V

    .line 102
    iget-object v0, p0, Landroid_src/mms/e/j;->a:Ljava/util/Vector;

    invoke-virtual {v0, p1, p2}, Ljava/util/Vector;->add(ILjava/lang/Object;)V

    .line 103
    return-void
.end method

.method public a(Landroid_src/mms/e/s;)Z
    .locals 1

    .prologue
    .line 81
    if-nez p1, :cond_0

    .line 82
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 85
    :cond_0
    invoke-direct {p0, p1}, Landroid_src/mms/e/j;->b(Landroid_src/mms/e/s;)V

    .line 86
    iget-object v0, p0, Landroid_src/mms/e/j;->a:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public b()I
    .locals 1

    .prologue
    .line 148
    iget-object v0, p0, Landroid_src/mms/e/j;->a:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    return v0
.end method
