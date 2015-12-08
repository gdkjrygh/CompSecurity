.class Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;
.super Ljava/lang/Object;
.source "ImppScribe.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lezvcard/io/scribe/ImppScribe;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "HtmlLinkFormat"
.end annotation


# instance fields
.field private final handleGroup:I

.field private final linkFormat:Ljava/lang/String;

.field private final parseRegex:Ljava/util/regex/Pattern;

.field private final protocol:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 3
    .param p1, "protocol"    # Ljava/lang/String;

    .prologue
    .line 230
    const-string v0, "(.*)"

    const/4 v1, 0x1

    const-string v2, "%s"

    invoke-direct {p0, p1, v0, v1, v2}, Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 231
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    .locals 3
    .param p1, "protocol"    # Ljava/lang/String;
    .param p2, "linkRegex"    # Ljava/lang/String;
    .param p3, "handleGroup"    # I
    .param p4, "linkFormat"    # Ljava/lang/String;

    .prologue
    const/16 v2, 0x3a

    .line 240
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 241
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x5e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;->parseRegex:Ljava/util/regex/Pattern;

    .line 242
    iput-object p1, p0, Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;->protocol:Ljava/lang/String;

    .line 243
    iput p3, p0, Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;->handleGroup:I

    .line 244
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;->linkFormat:Ljava/lang/String;

    .line 245
    return-void
.end method


# virtual methods
.method public buildLink(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1, "handle"    # Ljava/lang/String;

    .prologue
    .line 263
    iget-object v0, p0, Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;->linkFormat:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getProtocol()Ljava/lang/String;
    .locals 1

    .prologue
    .line 271
    iget-object v0, p0, Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;->protocol:Ljava/lang/String;

    return-object v0
.end method

.method public parseHandle(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "linkUri"    # Ljava/lang/String;

    .prologue
    .line 253
    iget-object v1, p0, Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;->parseRegex:Ljava/util/regex/Pattern;

    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 254
    .local v0, "m":Ljava/util/regex/Matcher;
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, p0, Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;->handleGroup:I

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    return-object v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method
