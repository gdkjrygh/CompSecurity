.class public Lcom/google/ads/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/reflect/Field;

.field private b:Ljava/lang/reflect/Field;

.field private c:Ljava/lang/reflect/Field;

.field private d:Ljava/lang/reflect/Field;


# direct methods
.method public constructor <init>()V
    .locals 6

    .prologue
    const/16 v5, 0x4d2

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    :try_start_0
    const-class v0, Lcom/google/android/gms/ads/AdRequest;

    invoke-direct {p0, v0}, Lcom/google/ads/b;->a(Ljava/lang/Class;)Ljava/lang/reflect/Field;

    move-result-object v0

    iput-object v0, p0, Lcom/google/ads/b;->c:Ljava/lang/reflect/Field;

    .line 36
    const-class v0, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;

    invoke-direct {p0, v0}, Lcom/google/ads/b;->a(Ljava/lang/Class;)Ljava/lang/reflect/Field;

    move-result-object v0

    iput-object v0, p0, Lcom/google/ads/b;->d:Ljava/lang/reflect/Field;

    .line 40
    iget-object v0, p0, Lcom/google/ads/b;->c:Ljava/lang/reflect/Field;

    new-instance v1, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v1}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    const-string v2, "1"

    .line 42
    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/AdRequest$Builder;->addTestDevice(Ljava/lang/String;)Lcom/google/android/gms/ads/AdRequest$Builder;

    move-result-object v1

    const-string v2, "2"

    .line 43
    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/AdRequest$Builder;->addTestDevice(Ljava/lang/String;)Lcom/google/android/gms/ads/AdRequest$Builder;

    move-result-object v1

    const-string v2, "3"

    .line 44
    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/AdRequest$Builder;->addTestDevice(Ljava/lang/String;)Lcom/google/android/gms/ads/AdRequest$Builder;

    move-result-object v1

    const/16 v2, 0x4d2

    .line 45
    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/AdRequest$Builder;->setGender(I)Lcom/google/android/gms/ads/AdRequest$Builder;

    move-result-object v1

    .line 46
    invoke-virtual {v1}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v1

    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 51
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/ads/b;->b:Ljava/lang/reflect/Field;

    .line 52
    const-class v0, Ljava/util/Set;

    invoke-direct {p0, v2, v0}, Lcom/google/ads/b;->a(Ljava/lang/Object;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Field;

    .line 53
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    .line 54
    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v1

    const/4 v4, 0x3

    if-lt v1, v4, :cond_0

    .line 55
    iput-object v0, p0, Lcom/google/ads/b;->b:Ljava/lang/reflect/Field;

    .line 62
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/ads/b;->a:Ljava/lang/reflect/Field;

    .line 63
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-direct {p0, v2, v0}, Lcom/google/ads/b;->a(Ljava/lang/Object;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Field;

    .line 64
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v3

    .line 65
    if-eq v3, v5, :cond_2

    .line 68
    const/4 v4, -0x1

    if-ne v3, v4, :cond_2

    .line 69
    iput-object v0, p0, Lcom/google/ads/b;->a:Ljava/lang/reflect/Field;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 72
    :catch_0
    move-exception v0

    .line 73
    const-string v1, "Ads"

    const-string v2, "Could not initialize ad request utilities."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 75
    :cond_3
    return-void
.end method

.method private a(Ljava/lang/Class;)Ljava/lang/reflect/Field;
    .locals 6

    .prologue
    .line 302
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v2

    array-length v3, v2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_2

    aget-object v0, v2, v1

    .line 303
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v4

    .line 304
    const-class v5, Ljava/lang/String;

    invoke-virtual {v5, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-nez v5, :cond_1

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 305
    invoke-virtual {v5, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 310
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->isAccessible()Z

    move-result v1

    if-nez v1, :cond_0

    .line 311
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 315
    :cond_0
    :goto_1
    return-object v0

    .line 302
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 315
    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

.method private a(Ljava/lang/Object;Ljava/lang/Class;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Class;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/lang/reflect/Field;",
            ">;"
        }
    .end annotation

    .prologue
    .line 273
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 274
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 275
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v2

    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_2

    aget-object v4, v2, v0

    .line 277
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v5

    and-int/lit8 v5, v5, 0x8

    if-gtz v5, :cond_1

    .line 282
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->isAccessible()Z

    move-result v5

    if-nez v5, :cond_0

    .line 283
    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 286
    :cond_0
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {p2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 287
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 275
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 290
    :cond_2
    return-object v1
.end method


# virtual methods
.method public a(Lcom/google/android/gms/ads/AdRequest;)Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 85
    :try_start_0
    iget-object v0, p0, Lcom/google/ads/b;->c:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 86
    new-instance v1, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;

    invoke-direct {v1}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;-><init>()V

    .line 88
    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdRequest;->getKeywords()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 89
    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;->addKeyword(Ljava/lang/String;)Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 134
    :catch_0
    move-exception v0

    .line 135
    const-string v1, "Ads"

    const-string v2, "Could not translate from AdRequest to PublisherAdRequest."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 137
    const/4 v0, 0x0

    :goto_1
    return-object v0

    .line 93
    :cond_0
    :try_start_1
    const-class v0, Lcom/google/ads/mediation/admob/AdMobAdapter;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/AdRequest;->getNetworkExtrasBundle(Ljava/lang/Class;)Landroid/os/Bundle;

    move-result-object v0

    .line 94
    if-eqz v0, :cond_1

    .line 95
    const-class v3, Lcom/google/ads/mediation/admob/AdMobAdapter;

    invoke-virtual {v1, v3, v0}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;->addNetworkExtrasBundle(Ljava/lang/Class;Landroid/os/Bundle;)Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;

    .line 99
    :cond_1
    iget-object v0, p0, Lcom/google/ads/b;->b:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_2

    .line 100
    iget-object v0, p0, Lcom/google/ads/b;->b:Ljava/lang/reflect/Field;

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    .line 101
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 102
    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;->addTestDevice(Ljava/lang/String;)Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;

    goto :goto_2

    .line 106
    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdRequest;->getBirthday()Ljava/util/Date;

    move-result-object v0

    .line 107
    if-eqz v0, :cond_3

    .line 108
    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdRequest;->getBirthday()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;->setBirthday(Ljava/util/Date;)Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;

    .line 111
    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdRequest;->getContentUrl()Ljava/lang/String;

    move-result-object v0

    .line 112
    if-eqz v0, :cond_4

    .line 113
    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;->setContentUrl(Ljava/lang/String;)Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;

    .line 116
    :cond_4
    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdRequest;->getGender()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;->setGender(I)Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;

    .line 118
    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdRequest;->getLocation()Landroid/location/Location;

    move-result-object v0

    .line 119
    if-eqz v0, :cond_5

    .line 120
    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;->setLocation(Landroid/location/Location;)Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;

    .line 124
    :cond_5
    iget-object v0, p0, Lcom/google/ads/b;->a:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_6

    .line 125
    iget-object v0, p0, Lcom/google/ads/b;->a:Ljava/lang/reflect/Field;

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v0

    .line 126
    if-nez v0, :cond_7

    .line 127
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;->tagForChildDirectedTreatment(Z)Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;

    :cond_6
    :goto_3
    move-object v0, v1

    .line 133
    goto :goto_1

    .line 128
    :cond_7
    if-ne v0, v4, :cond_6

    .line 129
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;->tagForChildDirectedTreatment(Z)Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3
.end method

.method public a(Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;)Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 147
    :try_start_0
    iget-object v0, p0, Lcom/google/ads/b;->d:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 148
    new-instance v1, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;

    invoke-direct {v1}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;-><init>()V

    .line 150
    invoke-virtual {p1}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->getKeywords()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 151
    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;->addKeyword(Ljava/lang/String;)Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 201
    :catch_0
    move-exception v0

    .line 202
    const-string v1, "Ads"

    const-string v2, "Could not make copy of PublisherAdRequest."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 204
    const/4 v0, 0x0

    :goto_1
    return-object v0

    .line 155
    :cond_0
    :try_start_1
    const-class v0, Lcom/google/ads/mediation/admob/AdMobAdapter;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->getNetworkExtrasBundle(Ljava/lang/Class;)Landroid/os/Bundle;

    move-result-object v0

    .line 156
    if-eqz v0, :cond_1

    .line 157
    const-class v3, Lcom/google/ads/mediation/admob/AdMobAdapter;

    invoke-virtual {v1, v3, v0}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;->addNetworkExtrasBundle(Ljava/lang/Class;Landroid/os/Bundle;)Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;

    .line 161
    :cond_1
    iget-object v0, p0, Lcom/google/ads/b;->b:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_2

    .line 162
    iget-object v0, p0, Lcom/google/ads/b;->b:Ljava/lang/reflect/Field;

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    .line 163
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 164
    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;->addTestDevice(Ljava/lang/String;)Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;

    goto :goto_2

    .line 168
    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->getBirthday()Ljava/util/Date;

    move-result-object v0

    .line 169
    if-eqz v0, :cond_3

    .line 170
    invoke-virtual {p1}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->getBirthday()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;->setBirthday(Ljava/util/Date;)Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;

    .line 173
    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->getContentUrl()Ljava/lang/String;

    move-result-object v0

    .line 174
    if-eqz v0, :cond_4

    .line 175
    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;->setContentUrl(Ljava/lang/String;)Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;

    .line 178
    :cond_4
    invoke-virtual {p1}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->getGender()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;->setGender(I)Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;

    .line 180
    invoke-virtual {p1}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->getLocation()Landroid/location/Location;

    move-result-object v0

    .line 181
    if-eqz v0, :cond_5

    .line 182
    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;->setLocation(Landroid/location/Location;)Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;

    .line 186
    :cond_5
    iget-object v0, p0, Lcom/google/ads/b;->a:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_6

    .line 187
    iget-object v0, p0, Lcom/google/ads/b;->a:Ljava/lang/reflect/Field;

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v0

    .line 188
    if-nez v0, :cond_8

    .line 189
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;->tagForChildDirectedTreatment(Z)Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;

    .line 195
    :cond_6
    :goto_3
    invoke-virtual {p1}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->getPublisherProvidedId()Ljava/lang/String;

    move-result-object v0

    .line 196
    if-eqz v0, :cond_7

    .line 197
    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;->setPublisherProvidedId(Ljava/lang/String;)Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;

    :cond_7
    move-object v0, v1

    .line 200
    goto :goto_1

    .line 190
    :cond_8
    if-ne v0, v4, :cond_6

    .line 191
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;->tagForChildDirectedTreatment(Z)Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3
.end method
