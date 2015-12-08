.class public final Lorg/b/b/b/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static e:Ljava/util/Hashtable;

.field static f:Ljava/lang/Class;

.field private static g:[Ljava/lang/Object;


# instance fields
.field a:Ljava/lang/Class;

.field b:Ljava/lang/ClassLoader;

.field c:Ljava/lang/String;

.field d:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 42
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    .line 44
    sput-object v0, Lorg/b/b/b/b;->e:Ljava/util/Hashtable;

    const-string v1, "void"

    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    sget-object v0, Lorg/b/b/b/b;->e:Ljava/util/Hashtable;

    const-string v1, "boolean"

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    sget-object v0, Lorg/b/b/b/b;->e:Ljava/util/Hashtable;

    const-string v1, "byte"

    sget-object v2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    sget-object v0, Lorg/b/b/b/b;->e:Ljava/util/Hashtable;

    const-string v1, "char"

    sget-object v2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    sget-object v0, Lorg/b/b/b/b;->e:Ljava/util/Hashtable;

    const-string v1, "short"

    sget-object v2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    sget-object v0, Lorg/b/b/b/b;->e:Ljava/util/Hashtable;

    const-string v1, "int"

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    sget-object v0, Lorg/b/b/b/b;->e:Ljava/util/Hashtable;

    const-string v1, "long"

    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    sget-object v0, Lorg/b/b/b/b;->e:Ljava/util/Hashtable;

    const-string v1, "float"

    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    sget-object v0, Lorg/b/b/b/b;->e:Ljava/util/Hashtable;

    const-string v1, "double"

    sget-object v2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    sput-object v0, Lorg/b/b/b/b;->g:[Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Class;)V
    .locals 1

    .prologue
    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    iput-object p1, p0, Lorg/b/b/b/b;->c:Ljava/lang/String;

    .line 82
    iput-object p2, p0, Lorg/b/b/b/b;->a:Ljava/lang/Class;

    .line 83
    const/4 v0, 0x0

    iput v0, p0, Lorg/b/b/b/b;->d:I

    .line 84
    invoke-virtual {p2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    iput-object v0, p0, Lorg/b/b/b/b;->b:Ljava/lang/ClassLoader;

    .line 85
    return-void
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/Class;
    .locals 2

    .prologue
    .line 75
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/NoClassDefFoundError;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NoClassDefFoundError;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method static a(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;
    .locals 1

    .prologue
    .line 56
    const-string v0, "*"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 57
    const/4 v0, 0x0

    .line 75
    :cond_0
    :goto_0
    return-object v0

    .line 58
    :cond_1
    sget-object v0, Lorg/b/b/b/b;->e:Ljava/util/Hashtable;

    invoke-virtual {v0, p0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 59
    if-nez v0, :cond_0

    .line 65
    if-nez p1, :cond_2

    .line 66
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    goto :goto_0

    .line 70
    :cond_2
    const/4 v0, 0x0

    invoke-static {p0, v0, p1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 75
    :catch_0
    move-exception v0

    sget-object v0, Lorg/b/b/b/b;->f:Ljava/lang/Class;

    if-nez v0, :cond_3

    const-string v0, "java.lang.ClassNotFoundException"

    invoke-static {v0}, Lorg/b/b/b/b;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lorg/b/b/b/b;->f:Ljava/lang/Class;

    goto :goto_0

    :cond_3
    sget-object v0, Lorg/b/b/b/b;->f:Ljava/lang/Class;

    goto :goto_0
.end method

.method public static a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;
    .locals 2

    .prologue
    .line 164
    new-instance v0, Lorg/b/b/b/c;

    sget-object v1, Lorg/b/b/b/b;->g:[Ljava/lang/Object;

    invoke-direct {v0, p0, p1, p2, v1}, Lorg/b/b/b/c;-><init>(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V

    return-object v0
.end method

.method public static a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;
    .locals 3

    .prologue
    .line 168
    new-instance v0, Lorg/b/b/b/c;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p3, v1, v2

    invoke-direct {v0, p0, p1, p2, v1}, Lorg/b/b/b/c;-><init>(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V

    return-object v0
.end method

.method public static a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Lorg/b/a/a;
    .locals 1

    .prologue
    .line 176
    new-instance v0, Lorg/b/b/b/c;

    invoke-direct {v0, p0, p1, p2, p3}, Lorg/b/b/b/c;-><init>(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;
    .locals 5

    .prologue
    .line 126
    new-instance v0, Lorg/b/b/b/c$a;

    iget v1, p0, Lorg/b/b/b/b;->d:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/b/b/b/b;->d:I

    new-instance v2, Lorg/b/b/b/g;

    iget-object v3, p0, Lorg/b/b/b/b;->a:Ljava/lang/Class;

    iget-object v4, p0, Lorg/b/b/b/b;->c:Ljava/lang/String;

    invoke-direct {v2, v3, v4, p3}, Lorg/b/b/b/g;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    invoke-direct {v0, v1, p1, p2, v2}, Lorg/b/b/b/c$a;-><init>(ILjava/lang/String;Lorg/b/a/d;Lorg/b/a/a/d;)V

    return-object v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;
    .locals 11

    .prologue
    .line 187
    const/16 v1, 0x10

    invoke-static {p1, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v2

    .line 189
    iget-object v1, p0, Lorg/b/b/b/b;->b:Ljava/lang/ClassLoader;

    invoke-static {p3, v1}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v4

    .line 191
    new-instance v3, Ljava/util/StringTokenizer;

    const-string v1, ":"

    invoke-direct {v3, p4, v1}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    invoke-virtual {v3}, Ljava/util/StringTokenizer;->countTokens()I

    move-result v6

    .line 193
    new-array v5, v6, [Ljava/lang/Class;

    .line 194
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v6, :cond_0

    .line 195
    invoke-virtual {v3}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lorg/b/b/b/b;->b:Ljava/lang/ClassLoader;

    invoke-static {v7, v8}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v7

    aput-object v7, v5, v1

    .line 194
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 197
    :cond_0
    new-instance v3, Ljava/util/StringTokenizer;

    const-string v1, ":"

    move-object/from16 v0, p5

    invoke-direct {v3, v0, v1}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    invoke-virtual {v3}, Ljava/util/StringTokenizer;->countTokens()I

    move-result v7

    .line 199
    new-array v6, v7, [Ljava/lang/String;

    .line 200
    const/4 v1, 0x0

    :goto_1
    if-ge v1, v7, :cond_1

    .line 201
    invoke-virtual {v3}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v8

    aput-object v8, v6, v1

    .line 200
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 203
    :cond_1
    new-instance v3, Ljava/util/StringTokenizer;

    const-string v1, ":"

    move-object/from16 v0, p6

    invoke-direct {v3, v0, v1}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    invoke-virtual {v3}, Ljava/util/StringTokenizer;->countTokens()I

    move-result v8

    .line 205
    new-array v7, v8, [Ljava/lang/Class;

    .line 206
    const/4 v1, 0x0

    :goto_2
    if-ge v1, v8, :cond_2

    .line 207
    invoke-virtual {v3}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v9

    iget-object v10, p0, Lorg/b/b/b/b;->b:Ljava/lang/ClassLoader;

    invoke-static {v9, v10}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v9

    aput-object v9, v7, v1

    .line 206
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 209
    :cond_2
    iget-object v1, p0, Lorg/b/b/b/b;->b:Ljava/lang/ClassLoader;

    move-object/from16 v0, p7

    invoke-static {v0, v1}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v8

    .line 211
    new-instance v1, Lorg/b/b/b/e;

    move-object v3, p2

    invoke-direct/range {v1 .. v8}, Lorg/b/b/b/e;-><init>(ILjava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;[Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)V

    .line 214
    return-object v1
.end method
