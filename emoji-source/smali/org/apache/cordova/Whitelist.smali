.class public Lorg/apache/cordova/Whitelist;
.super Ljava/lang/Object;
.source "Whitelist.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/cordova/Whitelist$URLPattern;
    }
.end annotation


# static fields
.field public static final TAG:Ljava/lang/String; = "Whitelist"


# instance fields
.field private whiteList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lorg/apache/cordova/Whitelist$URLPattern;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/apache/cordova/Whitelist;->whiteList:Ljava/util/ArrayList;

    .line 101
    return-void
.end method


# virtual methods
.method public addWhiteListEntry(Ljava/lang/String;Z)V
    .locals 11
    .param p1, "origin"    # Ljava/lang/String;
    .param p2, "subdomains"    # Z

    .prologue
    .line 115
    iget-object v7, p0, Lorg/apache/cordova/Whitelist;->whiteList:Ljava/util/ArrayList;

    if-eqz v7, :cond_0

    .line 118
    :try_start_0
    const-string v7, "*"

    invoke-virtual {p1, v7}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v7

    if-nez v7, :cond_1

    .line 119
    const-string v7, "Whitelist"

    const-string v8, "Unlimited access to network resources"

    invoke-static {v7, v8}, Lorg/apache/cordova/LOG;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    const/4 v7, 0x0

    iput-object v7, p0, Lorg/apache/cordova/Whitelist;->whiteList:Ljava/util/ArrayList;

    .line 145
    :cond_0
    :goto_0
    return-void

    .line 123
    :cond_1
    const-string v7, "^((\\*|[A-Za-z-]+):(//)?)?(\\*|((\\*\\.)?[^*/:]+))?(:(\\d+))?(/.*)?"

    invoke-static {v7}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v3

    .line 124
    .local v3, "parts":Ljava/util/regex/Pattern;
    invoke-virtual {v3, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    .line 125
    .local v2, "m":Ljava/util/regex/Matcher;
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v7

    if-eqz v7, :cond_0

    .line 126
    const/4 v7, 0x2

    invoke-virtual {v2, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v6

    .line 127
    .local v6, "scheme":Ljava/lang/String;
    const/4 v7, 0x4

    invoke-virtual {v2, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    .line 129
    .local v1, "host":Ljava/lang/String;
    const-string v7, "file"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    const-string v7, "content"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    :cond_2
    if-nez v1, :cond_3

    const-string v1, "*"

    .line 130
    :cond_3
    const/16 v7, 0x8

    invoke-virtual {v2, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v5

    .line 131
    .local v5, "port":Ljava/lang/String;
    const/16 v7, 0x9

    invoke-virtual {v2, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v4

    .line 132
    .local v4, "path":Ljava/lang/String;
    if-nez v6, :cond_4

    .line 134
    iget-object v7, p0, Lorg/apache/cordova/Whitelist;->whiteList:Ljava/util/ArrayList;

    new-instance v8, Lorg/apache/cordova/Whitelist$URLPattern;

    const-string v9, "http"

    invoke-direct {v8, v9, v1, v5, v4}, Lorg/apache/cordova/Whitelist$URLPattern;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    iget-object v7, p0, Lorg/apache/cordova/Whitelist;->whiteList:Ljava/util/ArrayList;

    new-instance v8, Lorg/apache/cordova/Whitelist$URLPattern;

    const-string v9, "https"

    invoke-direct {v8, v9, v1, v5, v4}, Lorg/apache/cordova/Whitelist$URLPattern;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 141
    .end local v1    # "host":Ljava/lang/String;
    .end local v2    # "m":Ljava/util/regex/Matcher;
    .end local v3    # "parts":Ljava/util/regex/Pattern;
    .end local v4    # "path":Ljava/lang/String;
    .end local v5    # "port":Ljava/lang/String;
    .end local v6    # "scheme":Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 142
    .local v0, "e":Ljava/lang/Exception;
    const-string v7, "Whitelist"

    const-string v8, "Failed to add origin %s"

    const/4 v9, 0x1

    new-array v9, v9, [Ljava/lang/Object;

    const/4 v10, 0x0

    aput-object p1, v9, v10

    invoke-static {v7, v8, v9}, Lorg/apache/cordova/LOG;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 137
    .end local v0    # "e":Ljava/lang/Exception;
    .restart local v1    # "host":Ljava/lang/String;
    .restart local v2    # "m":Ljava/util/regex/Matcher;
    .restart local v3    # "parts":Ljava/util/regex/Pattern;
    .restart local v4    # "path":Ljava/lang/String;
    .restart local v5    # "port":Ljava/lang/String;
    .restart local v6    # "scheme":Ljava/lang/String;
    :cond_4
    :try_start_1
    iget-object v7, p0, Lorg/apache/cordova/Whitelist;->whiteList:Ljava/util/ArrayList;

    new-instance v8, Lorg/apache/cordova/Whitelist$URLPattern;

    invoke-direct {v8, v6, v1, v5, v4}, Lorg/apache/cordova/Whitelist$URLPattern;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0
.end method

.method public isUrlWhiteListed(Ljava/lang/String;)Z
    .locals 5
    .param p1, "uri"    # Ljava/lang/String;

    .prologue
    const/4 v3, 0x1

    .line 156
    iget-object v4, p0, Lorg/apache/cordova/Whitelist;->whiteList:Ljava/util/ArrayList;

    if-nez v4, :cond_0

    .line 167
    :goto_0
    return v3

    .line 158
    :cond_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 160
    .local v1, "parsedUri":Landroid/net/Uri;
    iget-object v4, p0, Lorg/apache/cordova/Whitelist;->whiteList:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 161
    .local v2, "pit":Ljava/util/Iterator;, "Ljava/util/Iterator<Lorg/apache/cordova/Whitelist$URLPattern;>;"
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 162
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/cordova/Whitelist$URLPattern;

    .line 163
    .local v0, "p":Lorg/apache/cordova/Whitelist$URLPattern;
    invoke-virtual {v0, v1}, Lorg/apache/cordova/Whitelist$URLPattern;->matches(Landroid/net/Uri;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    .line 167
    .end local v0    # "p":Lorg/apache/cordova/Whitelist$URLPattern;
    :cond_2
    const/4 v3, 0x0

    goto :goto_0
.end method
