.class Lorg/apache/cordova/Whitelist$URLPattern;
.super Ljava/lang/Object;
.source "Whitelist.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/cordova/Whitelist;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "URLPattern"
.end annotation


# instance fields
.field public host:Ljava/util/regex/Pattern;

.field public path:Ljava/util/regex/Pattern;

.field public port:Ljava/lang/Integer;

.field public scheme:Ljava/util/regex/Pattern;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p1, "scheme"    # Ljava/lang/String;
    .param p2, "host"    # Ljava/lang/String;
    .param p3, "port"    # Ljava/lang/String;
    .param p4, "path"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/MalformedURLException;
        }
    .end annotation

    .prologue
    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    if-eqz p1, :cond_0

    :try_start_0
    const-string v1, "*"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 56
    :cond_0
    const/4 v1, 0x0

    iput-object v1, p0, Lorg/apache/cordova/Whitelist$URLPattern;->scheme:Ljava/util/regex/Pattern;

    .line 60
    :goto_0
    const-string v1, "*"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 61
    const/4 v1, 0x0

    iput-object v1, p0, Lorg/apache/cordova/Whitelist$URLPattern;->host:Ljava/util/regex/Pattern;

    .line 67
    :goto_1
    if-eqz p3, :cond_1

    const-string v1, "*"

    invoke-virtual {v1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 68
    :cond_1
    const/4 v1, 0x0

    iput-object v1, p0, Lorg/apache/cordova/Whitelist$URLPattern;->port:Ljava/lang/Integer;

    .line 72
    :goto_2
    if-eqz p4, :cond_2

    const-string v1, "/*"

    invoke-virtual {v1, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 73
    :cond_2
    const/4 v1, 0x0

    iput-object v1, p0, Lorg/apache/cordova/Whitelist$URLPattern;->path:Ljava/util/regex/Pattern;

    .line 80
    :goto_3
    return-void

    .line 58
    :cond_3
    const/4 v1, 0x0

    invoke-direct {p0, p1, v1}, Lorg/apache/cordova/Whitelist$URLPattern;->regexFromPattern(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v1

    iput-object v1, p0, Lorg/apache/cordova/Whitelist$URLPattern;->scheme:Ljava/util/regex/Pattern;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 77
    :catch_0
    move-exception v0

    .line 78
    .local v0, "e":Ljava/lang/NumberFormatException;
    new-instance v1, Ljava/net/MalformedURLException;

    const-string v2, "Port must be a number"

    invoke-direct {v1, v2}, Ljava/net/MalformedURLException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 62
    .end local v0    # "e":Ljava/lang/NumberFormatException;
    :cond_4
    :try_start_1
    const-string v1, "*."

    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 63
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "([a-z0-9.-]*\\.)?"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {p2, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {p0, v2, v3}, Lorg/apache/cordova/Whitelist$URLPattern;->regexFromPattern(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v1

    iput-object v1, p0, Lorg/apache/cordova/Whitelist$URLPattern;->host:Ljava/util/regex/Pattern;

    goto :goto_1

    .line 65
    :cond_5
    const/4 v1, 0x0

    invoke-direct {p0, p2, v1}, Lorg/apache/cordova/Whitelist$URLPattern;->regexFromPattern(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v1

    iput-object v1, p0, Lorg/apache/cordova/Whitelist$URLPattern;->host:Ljava/util/regex/Pattern;

    goto :goto_1

    .line 70
    :cond_6
    const/16 v1, 0xa

    invoke-static {p3, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p0, Lorg/apache/cordova/Whitelist$URLPattern;->port:Ljava/lang/Integer;

    goto :goto_2

    .line 75
    :cond_7
    const/4 v1, 0x1

    invoke-direct {p0, p4, v1}, Lorg/apache/cordova/Whitelist$URLPattern;->regexFromPattern(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    iput-object v1, p0, Lorg/apache/cordova/Whitelist$URLPattern;->path:Ljava/util/regex/Pattern;
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3
.end method

.method private regexFromPattern(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 6
    .param p1, "pattern"    # Ljava/lang/String;
    .param p2, "allowWildcards"    # Z

    .prologue
    .line 39
    const-string v3, "\\.[]{}()^$?+|"

    .line 40
    .local v3, "toReplace":Ljava/lang/String;
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .local v2, "regex":Ljava/lang/StringBuilder;
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v1, v4, :cond_2

    .line 42
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 43
    .local v0, "c":C
    const/16 v4, 0x2a

    if-ne v0, v4, :cond_1

    if-eqz p2, :cond_1

    .line 44
    const-string v4, "."

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    :cond_0
    :goto_1
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 41
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 45
    :cond_1
    const-string v4, "\\.[]{}()^$?+|"

    invoke-virtual {v4, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    const/4 v5, -0x1

    if-le v4, v5, :cond_0

    .line 46
    const/16 v4, 0x5c

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 50
    .end local v0    # "c":C
    :cond_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    return-object v4
.end method


# virtual methods
.method public matches(Landroid/net/Uri;)Z
    .locals 4
    .param p1, "uri"    # Landroid/net/Uri;

    .prologue
    const/4 v1, 0x0

    .line 84
    :try_start_0
    iget-object v2, p0, Lorg/apache/cordova/Whitelist$URLPattern;->scheme:Ljava/util/regex/Pattern;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lorg/apache/cordova/Whitelist$URLPattern;->scheme:Ljava/util/regex/Pattern;

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v2

    if-eqz v2, :cond_4

    :cond_0
    iget-object v2, p0, Lorg/apache/cordova/Whitelist$URLPattern;->host:Ljava/util/regex/Pattern;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lorg/apache/cordova/Whitelist$URLPattern;->host:Ljava/util/regex/Pattern;

    .line 85
    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v2

    if-eqz v2, :cond_4

    :cond_1
    iget-object v2, p0, Lorg/apache/cordova/Whitelist$URLPattern;->port:Ljava/lang/Integer;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lorg/apache/cordova/Whitelist$URLPattern;->port:Ljava/lang/Integer;

    .line 86
    invoke-virtual {p1}, Landroid/net/Uri;->getPort()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    :cond_2
    iget-object v2, p0, Lorg/apache/cordova/Whitelist$URLPattern;->path:Ljava/util/regex/Pattern;

    if-eqz v2, :cond_3

    iget-object v2, p0, Lorg/apache/cordova/Whitelist$URLPattern;->path:Ljava/util/regex/Pattern;

    .line 87
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    if-eqz v2, :cond_4

    :cond_3
    const/4 v1, 0x1

    .line 90
    :cond_4
    :goto_0
    return v1

    .line 88
    :catch_0
    move-exception v0

    .line 89
    .local v0, "e":Ljava/lang/Exception;
    const-string v2, "Whitelist"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lorg/apache/cordova/LOG;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method
