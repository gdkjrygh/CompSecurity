.class public Lorg/chromium/content_public/common/Referrer;
.super Ljava/lang/Object;
.source "Referrer.java"


# instance fields
.field private final mPolicy:I

.field private final mUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "policy"    # I

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lorg/chromium/content_public/common/Referrer;->mUrl:Ljava/lang/String;

    .line 17
    iput p2, p0, Lorg/chromium/content_public/common/Referrer;->mPolicy:I

    .line 18
    return-void
.end method


# virtual methods
.method public getPolicy()I
    .locals 1

    .prologue
    .line 25
    iget v0, p0, Lorg/chromium/content_public/common/Referrer;->mPolicy:I

    return v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lorg/chromium/content_public/common/Referrer;->mUrl:Ljava/lang/String;

    return-object v0
.end method
