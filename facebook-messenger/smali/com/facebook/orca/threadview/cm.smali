.class public Lcom/facebook/orca/threadview/cm;
.super Ljava/lang/Object;
.source "ThreadViewLoader.java"


# instance fields
.field public final a:Lcom/facebook/fbservice/service/ServiceException;

.field public final b:Z


# direct methods
.method public constructor <init>(Lcom/facebook/fbservice/service/ServiceException;Z)V
    .locals 0

    .prologue
    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    iput-object p1, p0, Lcom/facebook/orca/threadview/cm;->a:Lcom/facebook/fbservice/service/ServiceException;

    .line 99
    iput-boolean p2, p0, Lcom/facebook/orca/threadview/cm;->b:Z

    .line 100
    return-void
.end method
