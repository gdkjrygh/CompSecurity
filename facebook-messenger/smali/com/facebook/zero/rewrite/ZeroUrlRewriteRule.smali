.class public Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;
.super Ljava/lang/Object;
.source "ZeroUrlRewriteRule.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 132
    new-instance v0, Lcom/facebook/zero/rewrite/d;

    invoke-direct {v0}, Lcom/facebook/zero/rewrite/d;-><init>()V

    sput-object v0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->a:Ljava/lang/String;

    .line 53
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->b:Ljava/lang/String;

    .line 54
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->c:Ljava/lang/String;

    .line 56
    iget-object v0, p0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->a:Ljava/lang/String;

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->d:Ljava/util/regex/Pattern;

    .line 57
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/zero/rewrite/d;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0, p1}, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "matcher"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "replacer"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "mode"
        .end annotation
    .end param
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonCreator;
    .end annotation

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->a:Ljava/lang/String;

    .line 45
    iput-object p2, p0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->b:Ljava/lang/String;

    .line 46
    iput-object p3, p0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->c:Ljava/lang/String;

    .line 48
    iget-object v0, p0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->a:Ljava/lang/String;

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->d:Ljava/util/regex/Pattern;

    .line 49
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/common/w/q;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 60
    iget-object v2, p0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->c:Ljava/lang/String;

    const-string v3, "always"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    move v0, v1

    .line 68
    :cond_0
    :goto_0
    return v0

    .line 64
    :cond_1
    iget-object v2, p0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->c:Ljava/lang/String;

    const-string v3, "enabled_or_unknown"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 65
    sget-object v2, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    if-eq p1, v2, :cond_2

    sget-object v2, Lcom/facebook/common/w/q;->UNSET:Lcom/facebook/common/w/q;

    if-ne p1, v2, :cond_0

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->d:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    return v0
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 91
    iget-object v0, p0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->d:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 103
    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 108
    if-eqz p1, :cond_0

    instance-of v0, p1, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;

    if-nez v0, :cond_1

    :cond_0
    move v0, v1

    .line 112
    :goto_0
    return v0

    :cond_1
    iget-object v2, p0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->a:Ljava/lang/String;

    move-object v0, p1

    check-cast v0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;

    iget-object v0, v0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->a:Ljava/lang/String;

    invoke-static {v2, v0}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v2, p0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->b:Ljava/lang/String;

    move-object v0, p1

    check-cast v0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;

    iget-object v0, v0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->b:Ljava/lang/String;

    invoke-static {v2, v0}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->c:Ljava/lang/String;

    check-cast p1, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;

    iget-object v2, p1, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->c:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method public getMatcher()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "matcher"
    .end annotation

    .prologue
    .line 73
    iget-object v0, p0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getMode()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "mode"
    .end annotation

    .prologue
    .line 83
    iget-object v0, p0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->c:Ljava/lang/String;

    return-object v0
.end method

.method public getReplacer()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "replacer"
    .end annotation

    .prologue
    .line 78
    iget-object v0, p0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->b:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    .line 120
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->a:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->b:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->c:Ljava/lang/String;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/common/base/Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 125
    invoke-static {p0}, Lcom/google/common/base/Objects;->toStringHelper(Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "matcher"

    iget-object v2, p0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "replacer"

    iget-object v2, p0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "mode"

    iget-object v2, p0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/base/Objects$ToStringHelper;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 97
    iget-object v0, p0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 98
    iget-object v0, p0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 99
    return-void
.end method
