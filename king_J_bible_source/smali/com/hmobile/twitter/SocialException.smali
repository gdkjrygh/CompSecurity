.class public Lcom/hmobile/twitter/SocialException;
.super Ljava/lang/Exception;
.source "SocialException.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/hmobile/twitter/SocialException$SocialExceptionType;
    }
.end annotation


# instance fields
.field private m_type:Lcom/hmobile/twitter/SocialException$SocialExceptionType;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/hmobile/twitter/SocialException$SocialExceptionType;)V
    .locals 0
    .param p1, "type"    # Lcom/hmobile/twitter/SocialException$SocialExceptionType;

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/hmobile/twitter/SocialException;->m_type:Lcom/hmobile/twitter/SocialException$SocialExceptionType;

    .line 23
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "error"    # Ljava/lang/String;

    .prologue
    .line 12
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 13
    return-void
.end method


# virtual methods
.method public getExceptionType()Lcom/hmobile/twitter/SocialException$SocialExceptionType;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/hmobile/twitter/SocialException;->m_type:Lcom/hmobile/twitter/SocialException$SocialExceptionType;

    return-object v0
.end method
