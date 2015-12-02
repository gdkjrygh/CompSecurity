.class public Lcom/facebook/ui/d/d;
.super Ljava/lang/Object;
.source "ErrorMessageGenerator.java"


# static fields
.field private static final a:Ljava/lang/String;

.field private static final d:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lcom/facebook/common/e/h;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    .line 19
    const-class v0, Lcom/facebook/ui/d/d;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/ui/d/d;->a:Ljava/lang/String;

    .line 29
    const/16 v0, 0x1fa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget v1, Lcom/facebook/o;->publish_duplicate_error_message:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x170

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget v3, Lcom/facebook/o;->publish_sentry_fail:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const v4, 0x189117

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/facebook/o;->publish_invalid_tag_error_message:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static/range {v0 .. v5}, Lcom/google/common/a/ev;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ev;

    move-result-object v0

    sput-object v0, Lcom/facebook/ui/d/d;->d:Lcom/google/common/a/ev;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/common/e/h;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/facebook/ui/d/d;->b:Landroid/content/Context;

    .line 38
    iput-object p2, p0, Lcom/facebook/ui/d/d;->c:Lcom/facebook/common/e/h;

    .line 39
    return-void
.end method


# virtual methods
.method public a(I)Ljava/lang/String;
    .locals 4

    .prologue
    .line 86
    sget-object v0, Lcom/facebook/ui/d/d;->d:Lcom/google/common/a/ev;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/common/a/ev;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 87
    iget-object v0, p0, Lcom/facebook/ui/d/d;->c:Lcom/facebook/common/e/h;

    sget-object v1, Lcom/facebook/ui/d/d;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "No error message for error code "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    const/4 v0, 0x0

    .line 91
    :goto_0
    return-object v0

    :cond_0
    iget-object v1, p0, Lcom/facebook/ui/d/d;->b:Landroid/content/Context;

    sget-object v0, Lcom/facebook/ui/d/d;->d:Lcom/google/common/a/ev;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/common/a/ev;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Lcom/facebook/fbservice/service/ServiceException;ZZ)Ljava/lang/String;
    .locals 3

    .prologue
    .line 54
    const/4 v1, 0x0

    .line 55
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->a()Lcom/facebook/fbservice/service/t;

    move-result-object v0

    .line 56
    sget-object v2, Lcom/facebook/fbservice/service/t;->API_ERROR:Lcom/facebook/fbservice/service/t;

    if-ne v0, v2, :cond_2

    .line 57
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/ApiErrorResult;

    .line 58
    if-eqz p2, :cond_0

    .line 59
    invoke-virtual {v0}, Lcom/facebook/http/protocol/ApiErrorResult;->a()I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/facebook/ui/d/d;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 61
    :cond_0
    if-nez v1, :cond_4

    .line 62
    invoke-virtual {v0}, Lcom/facebook/http/protocol/ApiErrorResult;->b()Ljava/lang/String;

    move-result-object v0

    .line 68
    :goto_0
    if-nez v0, :cond_1

    if-eqz p3, :cond_1

    .line 69
    iget-object v0, p0, Lcom/facebook/ui/d/d;->b:Landroid/content/Context;

    sget v1, Lcom/facebook/o;->generic_error_message:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 71
    :cond_1
    return-object v0

    .line 64
    :cond_2
    sget-object v2, Lcom/facebook/fbservice/service/t;->CONNECTION_FAILURE:Lcom/facebook/fbservice/service/t;

    if-ne v0, v2, :cond_3

    .line 65
    iget-object v0, p0, Lcom/facebook/ui/d/d;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/facebook/o;->network_error_message:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    move-object v0, v1

    goto :goto_0

    :cond_4
    move-object v0, v1

    goto :goto_0
.end method
