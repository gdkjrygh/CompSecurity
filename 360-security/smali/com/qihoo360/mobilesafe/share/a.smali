.class public Lcom/qihoo360/mobilesafe/share/a;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo360/i/v1/main/IIpcPref;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo360/mobilesafe/share/a$a;
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/io/File;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput-object p2, p0, Lcom/qihoo360/mobilesafe/share/a;->b:Ljava/lang/String;

    .line 62
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, ".xml"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 63
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/share/IpcPrefJni;->prefOpen(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/qihoo360/mobilesafe/share/a;->a:I

    .line 64
    return-void
.end method

.method static synthetic a(Lcom/qihoo360/mobilesafe/share/a;)I
    .locals 1

    .prologue
    .line 17
    iget v0, p0, Lcom/qihoo360/mobilesafe/share/a;->a:I

    return v0
.end method

.method private static a(Ljava/io/DataInputStream;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 320
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/share/a;->b(Ljava/io/DataInputStream;)Ljava/lang/String;

    move-result-object v0

    .line 321
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    .line 322
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 324
    const/16 v2, 0x32

    if-ne v1, v2, :cond_1

    .line 325
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    .line 335
    :cond_0
    :goto_0
    return-object v0

    .line 326
    :cond_1
    const/16 v2, 0x33

    if-ne v1, v2, :cond_2

    .line 327
    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    goto :goto_0

    .line 328
    :cond_2
    const/16 v2, 0x34

    if-ne v1, v2, :cond_3

    .line 329
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    .line 330
    :cond_3
    const/16 v2, 0x35

    if-ne v1, v2, :cond_4

    .line 331
    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    .line 332
    :cond_4
    const/16 v2, 0x36

    if-eq v1, v2, :cond_0

    .line 334
    const/16 v0, 0x30

    if-ne v1, v0, :cond_5

    .line 335
    const/4 v0, 0x0

    goto :goto_0

    .line 337
    :cond_5
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "Not supported type "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private a(Ljava/lang/String;C)Ljava/lang/Object;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 280
    :try_start_0
    iget v1, p0, Lcom/qihoo360/mobilesafe/share/a;->a:I

    invoke-static {v1, p1}, Lcom/qihoo360/mobilesafe/share/IpcPrefJni;->prefGet(ILjava/lang/String;)[B

    move-result-object v1

    .line 281
    new-instance v2, Ljava/io/DataInputStream;

    new-instance v3, Ljava/io/ByteArrayInputStream;

    invoke-direct {v3, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v2, v3}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-static {v2}, Lcom/qihoo360/mobilesafe/share/a;->a(Ljava/io/DataInputStream;)Ljava/lang/Object;

    move-result-object v1

    .line 282
    packed-switch p2, :pswitch_data_0

    .line 300
    :goto_0
    return-object v0

    .line 284
    :pswitch_0
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    .line 286
    :pswitch_1
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    goto :goto_0

    .line 288
    :pswitch_2
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    .line 290
    :pswitch_3
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    .line 292
    :pswitch_4
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 297
    :catch_0
    move-exception v1

    goto :goto_0

    .line 282
    :pswitch_data_0
    .packed-switch 0x32
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method private static a([B)Ljava/util/HashMap;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "*>;"
        }
    .end annotation

    .prologue
    .line 304
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 305
    new-instance v2, Ljava/io/DataInputStream;

    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v2, v0}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 307
    :try_start_0
    invoke-virtual {v2}, Ljava/io/DataInputStream;->readInt()I

    move-result v3

    .line 308
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_0

    .line 309
    invoke-static {v2}, Lcom/qihoo360/mobilesafe/share/a;->b(Ljava/io/DataInputStream;)Ljava/lang/String;

    move-result-object v4

    .line 310
    invoke-static {v2}, Lcom/qihoo360/mobilesafe/share/a;->a(Ljava/io/DataInputStream;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 308
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 312
    :catch_0
    move-exception v0

    .line 316
    :cond_0
    return-object v1
.end method

.method private static final a(Ljava/io/DataOutputStream;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 342
    const-string/jumbo v0, "UTF-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    .line 343
    array-length v1, v0

    invoke-virtual {p0, v1}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 344
    invoke-virtual {p0, v0}, Ljava/io/DataOutputStream;->write([B)V

    .line 345
    return-void
.end method

.method static synthetic a(Ljava/io/DataOutputStream;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 17
    invoke-static {p0, p1}, Lcom/qihoo360/mobilesafe/share/a;->b(Ljava/io/DataOutputStream;Ljava/util/Map;)V

    return-void
.end method

.method private static final b(Ljava/io/DataInputStream;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 348
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    move-result v0

    .line 349
    new-array v1, v0, [B

    .line 350
    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Ljava/io/DataInputStream;->readFully([BII)V

    .line 351
    new-instance v0, Ljava/lang/String;

    const-string/jumbo v2, "UTF-8"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    return-object v0
.end method

.method private static b(Ljava/io/DataOutputStream;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/DataOutputStream;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 400
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    invoke-virtual {p0, v0}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 401
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 402
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {p0, v1}, Lcom/qihoo360/mobilesafe/share/a;->a(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 403
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {p0, v0}, Lcom/qihoo360/mobilesafe/share/a;->a(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    goto :goto_0

    .line 405
    :cond_0
    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 255
    iget v0, p0, Lcom/qihoo360/mobilesafe/share/a;->a:I

    invoke-static {v0, p1}, Lcom/qihoo360/mobilesafe/share/IpcPrefJni;->prefContains(ILjava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public edit()Landroid/content/SharedPreferences$Editor;
    .locals 1

    .prologue
    .line 260
    new-instance v0, Lcom/qihoo360/mobilesafe/share/a$a;

    invoke-direct {v0, p0}, Lcom/qihoo360/mobilesafe/share/a$a;-><init>(Lcom/qihoo360/mobilesafe/share/a;)V

    return-object v0
.end method

.method public getAll()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "*>;"
        }
    .end annotation

    .prologue
    .line 195
    iget v0, p0, Lcom/qihoo360/mobilesafe/share/a;->a:I

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/share/IpcPrefJni;->prefGetAll(I)[B

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/share/a;->a([B)Ljava/util/HashMap;

    move-result-object v0

    return-object v0
.end method

.method public getBoolean(Ljava/lang/String;Z)Z
    .locals 3

    .prologue
    .line 245
    const/16 v0, 0x32

    :try_start_0
    invoke-direct {p0, p1, v0}, Lcom/qihoo360/mobilesafe/share/a;->a(Ljava/lang/String;C)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    .line 246
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result p2

    .line 250
    :cond_0
    :goto_0
    return p2

    .line 247
    :catch_0
    move-exception v0

    .line 248
    const-string/jumbo v1, "IpcPref"

    const-string/jumbo v2, " fail to cast to Boolean "

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public getFloat(Ljava/lang/String;F)F
    .locals 3

    .prologue
    .line 234
    const/16 v0, 0x33

    :try_start_0
    invoke-direct {p0, p1, v0}, Lcom/qihoo360/mobilesafe/share/a;->a(Ljava/lang/String;C)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    .line 235
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result p2

    .line 239
    :cond_0
    :goto_0
    return p2

    .line 236
    :catch_0
    move-exception v0

    .line 237
    const-string/jumbo v1, "IpcPref"

    const-string/jumbo v2, " fail to cast to Float "

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public getInt(Ljava/lang/String;I)I
    .locals 3

    .prologue
    .line 212
    const/16 v0, 0x34

    :try_start_0
    invoke-direct {p0, p1, v0}, Lcom/qihoo360/mobilesafe/share/a;->a(Ljava/lang/String;C)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 213
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result p2

    .line 217
    :cond_0
    :goto_0
    return p2

    .line 214
    :catch_0
    move-exception v0

    .line 215
    const-string/jumbo v1, "IpcPref"

    const-string/jumbo v2, " fail to cast to Integer  "

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public getLong(Ljava/lang/String;J)J
    .locals 4

    .prologue
    .line 223
    const/16 v0, 0x35

    :try_start_0
    invoke-direct {p0, p1, v0}, Lcom/qihoo360/mobilesafe/share/a;->a(Ljava/lang/String;C)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    .line 224
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide p2

    .line 228
    :cond_0
    :goto_0
    return-wide p2

    .line 225
    :catch_0
    move-exception v0

    .line 226
    const-string/jumbo v1, "IpcPref"

    const-string/jumbo v2, " fail to cast to Long "

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 201
    const/16 v0, 0x36

    :try_start_0
    invoke-direct {p0, p1, v0}, Lcom/qihoo360/mobilesafe/share/a;->a(Ljava/lang/String;C)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 202
    if-eqz v0, :cond_0

    .line 206
    :goto_0
    return-object v0

    :cond_0
    move-object v0, p2

    .line 202
    goto :goto_0

    .line 203
    :catch_0
    move-exception v0

    .line 204
    const-string/jumbo v1, "IpcPref"

    const-string/jumbo v2, " fail to cast to String "

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-object v0, p2

    .line 206
    goto :goto_0
.end method

.method public getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 409
    new-instance v0, Ljava/lang/RuntimeException;

    const-string/jumbo v1, "Not supported getStringSet"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public varargs invoke([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 414
    new-instance v0, Ljava/lang/RuntimeException;

    const-string/jumbo v1, "Not supported"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V
    .locals 2

    .prologue
    .line 265
    new-instance v0, Ljava/lang/RuntimeException;

    const-string/jumbo v1, "Not supported OnSharedPreferenceChangeListener"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public reload(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 275
    iget v0, p0, Lcom/qihoo360/mobilesafe/share/a;->a:I

    invoke-static {v0, p1}, Lcom/qihoo360/mobilesafe/share/IpcPrefJni;->prefReload(ILjava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V
    .locals 2

    .prologue
    .line 270
    new-instance v0, Ljava/lang/RuntimeException;

    const-string/jumbo v1, "Not supported OnSharedPreferenceChangeListener"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
