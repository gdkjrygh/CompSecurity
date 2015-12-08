.class public final Lcom/roidapp/photogrid/common/af;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Lcom/roidapp/photogrid/common/af;


# instance fields
.field private a:Lcom/google/android/gms/analytics/l;

.field private b:Lcom/google/android/gms/analytics/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 21
    const/4 v0, 0x0

    sput-object v0, Lcom/roidapp/photogrid/common/af;->c:Lcom/roidapp/photogrid/common/af;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 63
    const-string v0, "UA-39415669-1"

    invoke-static {v0, p0, p1}, Lcom/roidapp/photogrid/common/af;->a(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)V

    .line 64
    const-string v0, "OpenPG"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1099
    const-string v0, "UA-39415669-17"

    invoke-static {v0, p0, p1}, Lcom/roidapp/photogrid/common/af;->a(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)V

    .line 67
    :cond_0
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V
    .locals 6

    .prologue
    .line 103
    const-string v0, "UA-39415669-4"

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Lcom/roidapp/photogrid/common/af;->a(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 104
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 111
    const-string v0, "UA-39415669-24"

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-static/range {v0 .. v6}, Lcom/roidapp/photogrid/common/af;->a(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;)V

    .line 112
    return-void
.end method

.method private static a(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 115
    invoke-static {}, Lcom/roidapp/photogrid/common/af;->b()Lcom/roidapp/photogrid/common/af;

    move-result-object v0

    .line 116
    if-eqz v0, :cond_0

    invoke-static {}, Lcom/roidapp/photogrid/common/af;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 121
    :try_start_0
    invoke-direct {v0, p1, p0}, Lcom/roidapp/photogrid/common/af;->e(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/gms/analytics/l;

    move-result-object v0

    .line 123
    invoke-virtual {v0, p2}, Lcom/google/android/gms/analytics/l;->a(Ljava/lang/String;)V

    .line 124
    new-instance v1, Lcom/google/android/gms/analytics/j;

    invoke-direct {v1}, Lcom/google/android/gms/analytics/j;-><init>()V

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/j;->a()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/l;->a(Ljava/util/Map;)V

    .line 125
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "trackid="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",view="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ExceptionInInitializerError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_2

    .line 134
    :cond_0
    :goto_0
    return-void

    .line 127
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 129
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/ExceptionInInitializerError;->printStackTrace()V

    goto :goto_0

    .line 131
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Error;->printStackTrace()V

    goto :goto_0
.end method

.method private static a(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V
    .locals 7

    .prologue
    .line 144
    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-static/range {v0 .. v6}, Lcom/roidapp/photogrid/common/af;->a(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;)V

    .line 145
    return-void
.end method

.method private static a(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 148
    invoke-static {}, Lcom/roidapp/photogrid/common/af;->b()Lcom/roidapp/photogrid/common/af;

    move-result-object v2

    .line 149
    if-eqz v2, :cond_0

    invoke-static {}, Lcom/roidapp/photogrid/common/af;->a()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 151
    :try_start_0
    invoke-direct {v2, p1, p0}, Lcom/roidapp/photogrid/common/af;->e(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/gms/analytics/l;

    move-result-object v4

    .line 152
    new-instance v5, Lcom/google/android/gms/analytics/h;

    invoke-direct {v5, p2, p3}, Lcom/google/android/gms/analytics/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 2000
    const-string v2, "&el"

    invoke-virtual {v5, v2, p4}, Lcom/google/android/gms/analytics/h;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/analytics/i;

    .line 154
    invoke-virtual {p5}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    .line 3000
    const-string v6, "&ev"

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v6, v2}, Lcom/google/android/gms/analytics/h;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/analytics/i;

    .line 155
    if-eqz p6, :cond_1

    .line 156
    invoke-interface {p6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .line 157
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 158
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 159
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    .line 160
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    .line 161
    move-object v0, v3

    check-cast v0, Ljava/lang/Integer;

    move-object v2, v0

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v2, v3}, Lcom/google/android/gms/analytics/h;->a(ILjava/lang/String;)Lcom/google/android/gms/analytics/i;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ExceptionInInitializerError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_2

    goto :goto_0

    .line 171
    :catch_0
    move-exception v2

    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    .line 178
    :cond_0
    :goto_1
    return-void

    .line 165
    :cond_1
    :try_start_1
    invoke-virtual {v5}, Lcom/google/android/gms/analytics/h;->a()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v4, v2}, Lcom/google/android/gms/analytics/l;->a(Ljava/util/Map;)V

    .line 166
    if-eqz p6, :cond_2

    .line 167
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "trackid="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",category ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",action="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",label="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",value="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",params="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/ExceptionInInitializerError; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_1

    .line 173
    :catch_1
    move-exception v2

    invoke-virtual {v2}, Ljava/lang/ExceptionInInitializerError;->printStackTrace()V

    goto :goto_1

    .line 169
    :cond_2
    :try_start_2
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "trackid="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",category="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",action="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",label="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",value="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/ExceptionInInitializerError; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_1

    .line 175
    :catch_2
    move-exception v2

    invoke-virtual {v2}, Ljava/lang/Error;->printStackTrace()V

    goto/16 :goto_1
.end method

.method private static a()Z
    .locals 2

    .prologue
    .line 56
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x5

    if-lt v0, v1, :cond_0

    .line 57
    const/4 v0, 0x1

    .line 59
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static b()Lcom/roidapp/photogrid/common/af;
    .locals 1

    .prologue
    .line 195
    sget-object v0, Lcom/roidapp/photogrid/common/af;->c:Lcom/roidapp/photogrid/common/af;

    if-nez v0, :cond_0

    .line 196
    new-instance v0, Lcom/roidapp/photogrid/common/af;

    invoke-direct {v0}, Lcom/roidapp/photogrid/common/af;-><init>()V

    sput-object v0, Lcom/roidapp/photogrid/common/af;->c:Lcom/roidapp/photogrid/common/af;

    .line 198
    :cond_0
    sget-object v0, Lcom/roidapp/photogrid/common/af;->c:Lcom/roidapp/photogrid/common/af;

    return-object v0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 75
    const-string v0, "UA-39415669-4"

    invoke-static {v0, p0, p1}, Lcom/roidapp/photogrid/common/af;->a(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)V

    .line 77
    return-void
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V
    .locals 6

    .prologue
    .line 107
    const-string v0, "UA-39415669-24"

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Lcom/roidapp/photogrid/common/af;->a(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 108
    return-void
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 85
    const-string v0, "UA-39415669-13"

    invoke-static {v0, p0, p1}, Lcom/roidapp/photogrid/common/af;->a(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)V

    .line 87
    return-void
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 90
    const-string v0, "UA-39415669-24"

    invoke-static {v0, p0, p1}, Lcom/roidapp/photogrid/common/af;->a(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)V

    .line 91
    return-void
.end method

.method private e(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/gms/analytics/l;
    .locals 4

    .prologue
    .line 181
    invoke-static {p1}, Lcom/google/android/gms/analytics/f;->a(Landroid/content/Context;)Lcom/google/android/gms/analytics/f;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/common/af;->b:Lcom/google/android/gms/analytics/f;

    .line 183
    iget-object v0, p0, Lcom/roidapp/photogrid/common/af;->b:Lcom/google/android/gms/analytics/f;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/analytics/f;->a(Ljava/lang/String;)Lcom/google/android/gms/analytics/l;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/common/af;->a:Lcom/google/android/gms/analytics/l;

    .line 184
    const-string v0, "UA-39415669-4"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "UA-39415669-17"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "UA-39415669-24"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 186
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/common/af;->a:Lcom/google/android/gms/analytics/l;

    const-wide/high16 v2, 0x4014000000000000L    # 5.0

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/analytics/l;->a(D)V

    .line 191
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/common/af;->a:Lcom/google/android/gms/analytics/l;

    return-object v0

    .line 187
    :cond_2
    const-string v0, "UA-39415669-13"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 189
    iget-object v0, p0, Lcom/roidapp/photogrid/common/af;->a:Lcom/google/android/gms/analytics/l;

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/analytics/l;->a(D)V

    goto :goto_0
.end method
