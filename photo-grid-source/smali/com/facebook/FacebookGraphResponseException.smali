.class public Lcom/facebook/FacebookGraphResponseException;
.super Lcom/facebook/FacebookException;
.source "SourceFile"


# instance fields
.field private final graphResponse:Lcom/facebook/GraphResponse;


# direct methods
.method public constructor <init>(Lcom/facebook/GraphResponse;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0, p2}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    .line 38
    iput-object p1, p0, Lcom/facebook/FacebookGraphResponseException;->graphResponse:Lcom/facebook/GraphResponse;

    .line 39
    return-void
.end method


# virtual methods
.method public final getGraphResponse()Lcom/facebook/GraphResponse;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/facebook/FacebookGraphResponseException;->graphResponse:Lcom/facebook/GraphResponse;

    return-object v0
.end method
