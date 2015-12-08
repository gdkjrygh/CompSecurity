.class public Lcom/splunk/mint/ExcludedUrls;
.super Ljava/util/ArrayList;
.source "ExcludedUrls.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/ArrayList",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# static fields
.field private static final MIN_URL_LENGTH:I = 0x5

.field private static final serialVersionUID:J = -0x3b98a92462e2b1c7L


# direct methods
.method public constructor <init>([Ljava/lang/String;)V
    .locals 4
    .param p1, "defaultExcludedUrls"    # [Ljava/lang/String;

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    move-object v0, p1

    .local v0, "arr$":[Ljava/lang/String;
    array-length v2, v0

    .local v2, "len$":I
    const/4 v1, 0x0

    .local v1, "i$":I
    :goto_0
    if-ge v1, v2, :cond_0

    aget-object v3, v0, v1

    .line 16
    .local v3, "url":Ljava/lang/String;
    invoke-virtual {p0, v3}, Lcom/splunk/mint/ExcludedUrls;->addValue(Ljava/lang/String;)V

    .line 15
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 18
    .end local v3    # "url":Ljava/lang/String;
    :cond_0
    return-void
.end method


# virtual methods
.method public addValue(Ljava/lang/String;)V
    .locals 2
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 22
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x5

    if-le v0, v1, :cond_0

    .line 23
    invoke-virtual {p0, p1}, Lcom/splunk/mint/ExcludedUrls;->add(Ljava/lang/Object;)Z

    .line 26
    :cond_0
    return-void
.end method
