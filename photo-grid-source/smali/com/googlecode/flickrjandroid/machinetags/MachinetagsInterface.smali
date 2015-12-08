.class public Lcom/googlecode/flickrjandroid/machinetags/MachinetagsInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final METHOD_GET_NAMESPACES:Ljava/lang/String; = "flickr.machinetags.getNamespaces"

.field private static final METHOD_GET_PAIRS:Ljava/lang/String; = "flickr.machinetags.getPairs"

.field private static final METHOD_GET_PREDICATES:Ljava/lang/String; = "flickr.machinetags.getPredicates"

.field private static final METHOD_GET_RECENTVALUES:Ljava/lang/String; = "flickr.machinetags.getRecentValues"

.field private static final METHOD_GET_VALUES:Ljava/lang/String; = "flickr.machinetags.getValues"


# instance fields
.field private apiKey:Ljava/lang/String;

.field private sharedSecret:Ljava/lang/String;

.field private transportAPI:Lcom/googlecode/flickrjandroid/Transport;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V
    .locals 0

    .prologue
    .line 223
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 224
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/machinetags/MachinetagsInterface;->apiKey:Ljava/lang/String;

    .line 225
    iput-object p2, p0, Lcom/googlecode/flickrjandroid/machinetags/MachinetagsInterface;->sharedSecret:Ljava/lang/String;

    .line 226
    iput-object p3, p0, Lcom/googlecode/flickrjandroid/machinetags/MachinetagsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    .line 227
    return-void
.end method

.method private parseNamespace(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/machinetags/Namespace;
    .locals 2

    .prologue
    .line 499
    new-instance v0, Lcom/googlecode/flickrjandroid/machinetags/Namespace;

    invoke-direct {v0}, Lcom/googlecode/flickrjandroid/machinetags/Namespace;-><init>()V

    .line 500
    const-string v1, "usage"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/machinetags/Namespace;->setUsage(Ljava/lang/String;)V

    .line 501
    const-string v1, "predicates"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/machinetags/Namespace;->setPredicates(Ljava/lang/String;)V

    .line 502
    const-string v1, "_content"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/machinetags/Namespace;->setValue(Ljava/lang/String;)V

    .line 503
    return-object v0
.end method

.method private parsePair(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/machinetags/Pair;
    .locals 2

    .prologue
    .line 507
    new-instance v0, Lcom/googlecode/flickrjandroid/machinetags/Pair;

    invoke-direct {v0}, Lcom/googlecode/flickrjandroid/machinetags/Pair;-><init>()V

    .line 508
    const-string v1, "usage"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/machinetags/Pair;->setUsage(Ljava/lang/String;)V

    .line 509
    const-string v1, "namespace"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/machinetags/Pair;->setNamespace(Ljava/lang/String;)V

    .line 510
    const-string v1, "predicate"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/machinetags/Pair;->setPredicate(Ljava/lang/String;)V

    .line 511
    return-object v0
.end method

.method private parsePredicate(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/machinetags/Predicate;
    .locals 2

    .prologue
    .line 491
    new-instance v0, Lcom/googlecode/flickrjandroid/machinetags/Predicate;

    invoke-direct {v0}, Lcom/googlecode/flickrjandroid/machinetags/Predicate;-><init>()V

    .line 492
    const-string v1, "usage"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/machinetags/Predicate;->setUsage(Ljava/lang/String;)V

    .line 493
    const-string v1, "namespaces"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/machinetags/Predicate;->setNamespaces(Ljava/lang/String;)V

    .line 494
    const-string v1, "_content"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/machinetags/Predicate;->setValue(Ljava/lang/String;)V

    .line 495
    return-object v0
.end method

.method private parseValue(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/machinetags/Value;
    .locals 2

    .prologue
    .line 479
    new-instance v0, Lcom/googlecode/flickrjandroid/machinetags/Value;

    invoke-direct {v0}, Lcom/googlecode/flickrjandroid/machinetags/Value;-><init>()V

    .line 480
    const-string v1, "usage"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/machinetags/Value;->setUsage(Ljava/lang/String;)V

    .line 481
    const-string v1, "namespace"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/machinetags/Value;->setNamespace(Ljava/lang/String;)V

    .line 482
    const-string v1, "predicate"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/machinetags/Value;->setPredicate(Ljava/lang/String;)V

    .line 483
    const-string v1, "first_added"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/machinetags/Value;->setFirstAdded(Ljava/lang/String;)V

    .line 484
    const-string v1, "last_added"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/machinetags/Value;->setLastAdded(Ljava/lang/String;)V

    .line 485
    const-string v1, "_content"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/flickrjandroid/machinetags/Value;->setValue(Ljava/lang/String;)V

    .line 486
    return-object v0
.end method


# virtual methods
.method public getNamespaces(Ljava/lang/String;II)Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 245
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 246
    new-instance v1, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;

    invoke-direct {v1}, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;-><init>()V

    .line 247
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "method"

    const-string v4, "flickr.machinetags.getNamespaces"

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 248
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "api_key"

    iget-object v4, p0, Lcom/googlecode/flickrjandroid/machinetags/MachinetagsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 250
    if-eqz p1, :cond_0

    .line 251
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "predicate"

    invoke-direct {v2, v3, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 253
    :cond_0
    if-lez p2, :cond_1

    .line 254
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "per_page"

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 256
    :cond_1
    if-lez p3, :cond_2

    .line 257
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "page"

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 260
    :cond_2
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/machinetags/MachinetagsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/machinetags/MachinetagsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    invoke-virtual {v3}, Lcom/googlecode/flickrjandroid/Transport;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Transport;->get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 261
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 262
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 264
    :cond_3
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    const-string v2, "namespaces"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 265
    const-string v2, "namespace"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 266
    invoke-virtual {v1, v5}, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;->setPage(I)V

    .line 267
    invoke-virtual {v1, v5}, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;->setPages(I)V

    .line 268
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;->setPerPage(I)V

    .line 269
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;->setTotal(I)V

    .line 270
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lt v0, v3, :cond_4

    .line 274
    return-object v1

    .line 271
    :cond_4
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 272
    invoke-direct {p0, v3}, Lcom/googlecode/flickrjandroid/machinetags/MachinetagsInterface;->parseNamespace(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/machinetags/Namespace;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;->add(Ljava/lang/Object;)Z

    .line 270
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public getPairs(Ljava/lang/String;Ljava/lang/String;II)Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;
    .locals 5

    .prologue
    .line 294
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 295
    new-instance v1, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;

    invoke-direct {v1}, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;-><init>()V

    .line 296
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "method"

    const-string v4, "flickr.machinetags.getPairs"

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 297
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "api_key"

    iget-object v4, p0, Lcom/googlecode/flickrjandroid/machinetags/MachinetagsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 299
    if-eqz p1, :cond_0

    .line 300
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "namespace"

    invoke-direct {v2, v3, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 302
    :cond_0
    if-eqz p2, :cond_1

    .line 303
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "predicate"

    invoke-direct {v2, v3, p2}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 305
    :cond_1
    if-lez p3, :cond_2

    .line 306
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "per_page"

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 308
    :cond_2
    if-lez p4, :cond_3

    .line 309
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "page"

    invoke-static {p4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 312
    :cond_3
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/machinetags/MachinetagsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/machinetags/MachinetagsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    invoke-virtual {v3}, Lcom/googlecode/flickrjandroid/Transport;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Transport;->get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 313
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 314
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 316
    :cond_4
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    const-string v2, "pairs"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 317
    const-string v2, "pair"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 318
    const-string v3, "page"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;->setPage(I)V

    .line 319
    const-string v3, "pages"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;->setPages(I)V

    .line 320
    const-string v3, "perPage"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;->setPerPage(I)V

    .line 321
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;->setTotal(I)V

    .line 322
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lt v0, v3, :cond_5

    .line 326
    return-object v1

    .line 323
    :cond_5
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 324
    invoke-direct {p0, v3}, Lcom/googlecode/flickrjandroid/machinetags/MachinetagsInterface;->parsePair(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/machinetags/Pair;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;->add(Ljava/lang/Object;)Z

    .line 322
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public getPredicates(Ljava/lang/String;II)Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;
    .locals 5

    .prologue
    .line 345
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 346
    new-instance v1, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;

    invoke-direct {v1}, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;-><init>()V

    .line 347
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "method"

    const-string v4, "flickr.machinetags.getPredicates"

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 348
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "api_key"

    iget-object v4, p0, Lcom/googlecode/flickrjandroid/machinetags/MachinetagsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 350
    if-eqz p1, :cond_0

    .line 351
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "namespace"

    invoke-direct {v2, v3, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 353
    :cond_0
    if-lez p2, :cond_1

    .line 354
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "per_page"

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 356
    :cond_1
    if-lez p3, :cond_2

    .line 357
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "page"

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 360
    :cond_2
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/machinetags/MachinetagsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/machinetags/MachinetagsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    invoke-virtual {v3}, Lcom/googlecode/flickrjandroid/Transport;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Transport;->get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 361
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 362
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 364
    :cond_3
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    const-string v2, "predicates"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 365
    const-string v2, "predicate"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 366
    const-string v3, "page"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;->setPage(I)V

    .line 367
    const-string v3, "pages"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;->setPages(I)V

    .line 368
    const-string v3, "perPage"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;->setPerPage(I)V

    .line 369
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;->setTotal(I)V

    .line 370
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lt v0, v3, :cond_4

    .line 374
    return-object v1

    .line 371
    :cond_4
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 372
    invoke-direct {p0, v3}, Lcom/googlecode/flickrjandroid/machinetags/MachinetagsInterface;->parsePredicate(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/machinetags/Predicate;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;->add(Ljava/lang/Object;)Z

    .line 370
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public getRecentValues(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;
    .locals 10

    .prologue
    .line 443
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 444
    new-instance v1, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;

    invoke-direct {v1}, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;-><init>()V

    .line 445
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "method"

    const-string v4, "flickr.machinetags.getRecentValues"

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 446
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "api_key"

    iget-object v4, p0, Lcom/googlecode/flickrjandroid/machinetags/MachinetagsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 448
    if-eqz p1, :cond_0

    .line 449
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "namespace"

    invoke-direct {v2, v3, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 451
    :cond_0
    if-eqz p2, :cond_1

    .line 452
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "predicate"

    invoke-direct {v2, v3, p2}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 454
    :cond_1
    if-eqz p3, :cond_2

    .line 455
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    .line 456
    const-string v3, "added_since"

    .line 457
    new-instance v4, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    const-wide/16 v8, 0x3e8

    div-long/2addr v6, v8

    invoke-direct {v4, v6, v7}, Ljava/lang/Long;-><init>(J)V

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 455
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 461
    :cond_2
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/machinetags/MachinetagsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/machinetags/MachinetagsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    invoke-virtual {v3}, Lcom/googlecode/flickrjandroid/Transport;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Transport;->get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 462
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 463
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 465
    :cond_3
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    const-string v2, "values"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 466
    const-string v2, "value"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 467
    const-string v3, "page"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;->setPage(I)V

    .line 468
    const-string v3, "pages"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;->setPages(I)V

    .line 469
    const-string v3, "perPage"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;->setPerPage(I)V

    .line 470
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;->setTotal(I)V

    .line 471
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lt v0, v3, :cond_4

    .line 475
    return-object v1

    .line 472
    :cond_4
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 473
    invoke-direct {p0, v3}, Lcom/googlecode/flickrjandroid/machinetags/MachinetagsInterface;->parseValue(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/machinetags/Value;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;->add(Ljava/lang/Object;)Z

    .line 471
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public getValues(Ljava/lang/String;Ljava/lang/String;II)Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;
    .locals 5

    .prologue
    .line 393
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 394
    new-instance v1, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;

    invoke-direct {v1}, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;-><init>()V

    .line 395
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "method"

    const-string v4, "flickr.machinetags.getValues"

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 396
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "api_key"

    iget-object v4, p0, Lcom/googlecode/flickrjandroid/machinetags/MachinetagsInterface;->apiKey:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 398
    if-eqz p1, :cond_0

    .line 399
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "namespace"

    invoke-direct {v2, v3, p1}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 401
    :cond_0
    if-eqz p2, :cond_1

    .line 402
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "predicate"

    invoke-direct {v2, v3, p2}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 404
    :cond_1
    if-lez p3, :cond_2

    .line 405
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "per_page"

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 407
    :cond_2
    if-lez p4, :cond_3

    .line 408
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "page"

    invoke-static {p4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 411
    :cond_3
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/machinetags/MachinetagsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/machinetags/MachinetagsInterface;->transportAPI:Lcom/googlecode/flickrjandroid/Transport;

    invoke-virtual {v3}, Lcom/googlecode/flickrjandroid/Transport;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Transport;->get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    .line 412
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->isError()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 413
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1

    .line 415
    :cond_4
    invoke-interface {v0}, Lcom/googlecode/flickrjandroid/Response;->getData()Lorg/json/JSONObject;

    move-result-object v0

    const-string v2, "values"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 416
    const-string v2, "value"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 417
    const-string v3, "page"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;->setPage(I)V

    .line 418
    const-string v3, "pages"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;->setPages(I)V

    .line 419
    const-string v3, "perPage"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;->setPerPage(I)V

    .line 420
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;->setTotal(I)V

    .line 421
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lt v0, v3, :cond_5

    .line 425
    return-object v1

    .line 422
    :cond_5
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 423
    invoke-direct {p0, v3}, Lcom/googlecode/flickrjandroid/machinetags/MachinetagsInterface;->parseValue(Lorg/json/JSONObject;)Lcom/googlecode/flickrjandroid/machinetags/Value;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/googlecode/flickrjandroid/machinetags/NamespacesList;->add(Ljava/lang/Object;)Z

    .line 421
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method
