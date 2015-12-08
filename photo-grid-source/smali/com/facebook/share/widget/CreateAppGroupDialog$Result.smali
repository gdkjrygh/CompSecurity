.class public final Lcom/facebook/share/widget/CreateAppGroupDialog$Result;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final id:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p1, p0, Lcom/facebook/share/widget/CreateAppGroupDialog$Result;->id:Ljava/lang/String;

    .line 60
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lcom/facebook/share/widget/CreateAppGroupDialog$1;)V
    .locals 0

    .prologue
    .line 55
    invoke-direct {p0, p1}, Lcom/facebook/share/widget/CreateAppGroupDialog$Result;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/facebook/share/widget/CreateAppGroupDialog$Result;->id:Ljava/lang/String;

    return-object v0
.end method
