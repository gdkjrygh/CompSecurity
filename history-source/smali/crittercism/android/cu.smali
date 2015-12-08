.class public final Lcrittercism/android/cu;
.super Ljava/lang/Object;

# interfaces
.implements Lcrittercism/android/cw;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcrittercism/android/cu$a;
    }
.end annotation


# instance fields
.field public a:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lcrittercism/android/au;)V
    .locals 3

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcrittercism/android/cu;->a:Ljava/util/Map;

    .line 39
    iget-object v0, p0, Lcrittercism/android/cu;->a:Ljava/util/Map;

    const-string v1, "app_id"

    invoke-interface {p1}, Lcrittercism/android/au;->a()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    iget-object v0, p0, Lcrittercism/android/cu;->a:Ljava/util/Map;

    const-string v1, "hashed_device_id"

    invoke-interface {p1}, Lcrittercism/android/au;->c()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    iget-object v0, p0, Lcrittercism/android/cu;->a:Ljava/util/Map;

    const-string v1, "library_version"

    const-string v2, "5.0.4"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)Lcrittercism/android/cu;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcrittercism/android/cu;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    return-object p0
.end method

.method public final a(Ljava/lang/String;Lorg/json/JSONArray;)Lcrittercism/android/cu;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcrittercism/android/cu;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    return-object p0
.end method

.method public final synthetic a(Lcrittercism/android/br;)Lcrittercism/android/cw;
    .locals 3

    .prologue
    .line 20
    invoke-virtual {p1}, Lcrittercism/android/br;->d()Ljava/lang/String;

    iget-object v0, p0, Lcrittercism/android/cu;->a:Ljava/util/Map;

    invoke-virtual {p1}, Lcrittercism/android/br;->d()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcrittercism/android/bn;

    invoke-direct {v2, p1}, Lcrittercism/android/bn;-><init>(Lcrittercism/android/br;)V

    iget-object v2, v2, Lcrittercism/android/bn;->a:Lorg/json/JSONArray;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final a(Ljava/io/OutputStream;)V
    .locals 2

    .prologue
    .line 83
    invoke-static {}, Lcrittercism/android/dx;->b()V

    .line 84
    new-instance v0, Lorg/json/JSONObject;

    iget-object v1, p0, Lcrittercism/android/cu;->a:Ljava/util/Map;

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 85
    return-void
.end method
