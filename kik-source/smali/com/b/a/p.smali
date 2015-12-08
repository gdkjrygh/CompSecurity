.class public final Lcom/b/a/p;
.super Lcom/b/a/s;
.source "SourceFile"


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 65
    invoke-direct {p0, p1}, Lcom/b/a/s;-><init>(Ljava/lang/String;)V

    .line 66
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 69
    invoke-direct {p0, p1, p2}, Lcom/b/a/s;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 70
    return-void
.end method

.method static a()Lcom/b/a/p;
    .locals 2

    .prologue
    .line 77
    new-instance v0, Lcom/b/a/p;

    const-string v1, "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length."

    invoke-direct {v0, v1}, Lcom/b/a/p;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static a(Ljava/lang/Throwable;)Lcom/b/a/p;
    .locals 2

    .prologue
    .line 73
    new-instance v0, Lcom/b/a/p;

    const-string v1, "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length."

    invoke-direct {v0, v1, p0}, Lcom/b/a/p;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method static b()Lcom/b/a/p;
    .locals 2

    .prologue
    .line 81
    new-instance v0, Lcom/b/a/p;

    const-string v1, "CodedInput encountered an embedded string or bytes that misreported its size."

    invoke-direct {v0, v1}, Lcom/b/a/p;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static c()Lcom/b/a/p;
    .locals 2

    .prologue
    .line 87
    new-instance v0, Lcom/b/a/p;

    const-string v1, "CodedInput encountered an embedded string or message which claimed to have negative size."

    invoke-direct {v0, v1}, Lcom/b/a/p;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static d()Lcom/b/a/p;
    .locals 2

    .prologue
    .line 93
    new-instance v0, Lcom/b/a/p;

    const-string v1, "CodedInput encountered a malformed varint."

    invoke-direct {v0, v1}, Lcom/b/a/p;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static e()Lcom/b/a/p;
    .locals 2

    .prologue
    .line 98
    new-instance v0, Lcom/b/a/p;

    const-string v1, "Protocol message contained an invalid tag (zero)."

    invoke-direct {v0, v1}, Lcom/b/a/p;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static f()Lcom/b/a/p;
    .locals 2

    .prologue
    .line 103
    new-instance v0, Lcom/b/a/p;

    const-string v1, "Protocol message end-group tag did not match expected tag."

    invoke-direct {v0, v1}, Lcom/b/a/p;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static g()Lcom/b/a/p;
    .locals 2

    .prologue
    .line 108
    new-instance v0, Lcom/b/a/p;

    const-string v1, "Protocol message tag had invalid wire type."

    invoke-direct {v0, v1}, Lcom/b/a/p;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static h()Lcom/b/a/p;
    .locals 2

    .prologue
    .line 119
    new-instance v0, Lcom/b/a/p;

    const-string v1, "Protocol message was too large.  May be malicious.  Use CodedInput.setSizeLimit() to increase the size limit."

    invoke-direct {v0, v1}, Lcom/b/a/p;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
