.class public final Lcom/facebook/share/model/GameRequestContent;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/share/model/ShareModel;


# instance fields
.field private final actionType:Lcom/facebook/share/model/GameRequestContent$ActionType;

.field private final data:Ljava/lang/String;

.field private final filters:Lcom/facebook/share/model/GameRequestContent$Filters;

.field private final message:Ljava/lang/String;

.field private final objectId:Ljava/lang/String;

.field private final suggestions:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final title:Ljava/lang/String;

.field private final to:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/model/GameRequestContent;->message:Ljava/lang/String;

    .line 65
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/model/GameRequestContent;->to:Ljava/lang/String;

    .line 66
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/model/GameRequestContent;->title:Ljava/lang/String;

    .line 67
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/model/GameRequestContent;->data:Ljava/lang/String;

    .line 68
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/share/model/GameRequestContent$ActionType;->valueOf(Ljava/lang/String;)Lcom/facebook/share/model/GameRequestContent$ActionType;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/model/GameRequestContent;->actionType:Lcom/facebook/share/model/GameRequestContent$ActionType;

    .line 69
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/model/GameRequestContent;->objectId:Ljava/lang/String;

    .line 70
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/share/model/GameRequestContent$Filters;->valueOf(Ljava/lang/String;)Lcom/facebook/share/model/GameRequestContent$Filters;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/model/GameRequestContent;->filters:Lcom/facebook/share/model/GameRequestContent$Filters;

    .line 71
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/share/model/GameRequestContent;->suggestions:Ljava/util/ArrayList;

    .line 72
    iget-object v0, p0, Lcom/facebook/share/model/GameRequestContent;->suggestions:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readStringList(Ljava/util/List;)V

    .line 73
    return-void
.end method

.method private constructor <init>(Lcom/facebook/share/model/GameRequestContent$Builder;)V
    .locals 1

    .prologue
    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    # getter for: Lcom/facebook/share/model/GameRequestContent$Builder;->message:Ljava/lang/String;
    invoke-static {p1}, Lcom/facebook/share/model/GameRequestContent$Builder;->access$000(Lcom/facebook/share/model/GameRequestContent$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/model/GameRequestContent;->message:Ljava/lang/String;

    .line 54
    # getter for: Lcom/facebook/share/model/GameRequestContent$Builder;->to:Ljava/lang/String;
    invoke-static {p1}, Lcom/facebook/share/model/GameRequestContent$Builder;->access$100(Lcom/facebook/share/model/GameRequestContent$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/model/GameRequestContent;->to:Ljava/lang/String;

    .line 55
    # getter for: Lcom/facebook/share/model/GameRequestContent$Builder;->title:Ljava/lang/String;
    invoke-static {p1}, Lcom/facebook/share/model/GameRequestContent$Builder;->access$200(Lcom/facebook/share/model/GameRequestContent$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/model/GameRequestContent;->title:Ljava/lang/String;

    .line 56
    # getter for: Lcom/facebook/share/model/GameRequestContent$Builder;->data:Ljava/lang/String;
    invoke-static {p1}, Lcom/facebook/share/model/GameRequestContent$Builder;->access$300(Lcom/facebook/share/model/GameRequestContent$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/model/GameRequestContent;->data:Ljava/lang/String;

    .line 57
    # getter for: Lcom/facebook/share/model/GameRequestContent$Builder;->actionType:Lcom/facebook/share/model/GameRequestContent$ActionType;
    invoke-static {p1}, Lcom/facebook/share/model/GameRequestContent$Builder;->access$400(Lcom/facebook/share/model/GameRequestContent$Builder;)Lcom/facebook/share/model/GameRequestContent$ActionType;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/model/GameRequestContent;->actionType:Lcom/facebook/share/model/GameRequestContent$ActionType;

    .line 58
    # getter for: Lcom/facebook/share/model/GameRequestContent$Builder;->objectId:Ljava/lang/String;
    invoke-static {p1}, Lcom/facebook/share/model/GameRequestContent$Builder;->access$500(Lcom/facebook/share/model/GameRequestContent$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/model/GameRequestContent;->objectId:Ljava/lang/String;

    .line 59
    # getter for: Lcom/facebook/share/model/GameRequestContent$Builder;->filters:Lcom/facebook/share/model/GameRequestContent$Filters;
    invoke-static {p1}, Lcom/facebook/share/model/GameRequestContent$Builder;->access$600(Lcom/facebook/share/model/GameRequestContent$Builder;)Lcom/facebook/share/model/GameRequestContent$Filters;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/model/GameRequestContent;->filters:Lcom/facebook/share/model/GameRequestContent$Filters;

    .line 60
    # getter for: Lcom/facebook/share/model/GameRequestContent$Builder;->suggestions:Ljava/util/ArrayList;
    invoke-static {p1}, Lcom/facebook/share/model/GameRequestContent$Builder;->access$700(Lcom/facebook/share/model/GameRequestContent$Builder;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/model/GameRequestContent;->suggestions:Ljava/util/ArrayList;

    .line 61
    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/share/model/GameRequestContent$Builder;Lcom/facebook/share/model/GameRequestContent$1;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0, p1}, Lcom/facebook/share/model/GameRequestContent;-><init>(Lcom/facebook/share/model/GameRequestContent$Builder;)V

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    .prologue
    .line 132
    const/4 v0, 0x0

    return v0
.end method

.method public final getActionType()Lcom/facebook/share/model/GameRequestContent$ActionType;
    .locals 1

    .prologue
    .line 107
    iget-object v0, p0, Lcom/facebook/share/model/GameRequestContent;->actionType:Lcom/facebook/share/model/GameRequestContent$ActionType;

    return-object v0
.end method

.method public final getData()Ljava/lang/String;
    .locals 1

    .prologue
    .line 100
    iget-object v0, p0, Lcom/facebook/share/model/GameRequestContent;->data:Ljava/lang/String;

    return-object v0
.end method

.method public final getFilters()Lcom/facebook/share/model/GameRequestContent$Filters;
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, Lcom/facebook/share/model/GameRequestContent;->filters:Lcom/facebook/share/model/GameRequestContent$Filters;

    return-object v0
.end method

.method public final getMessage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lcom/facebook/share/model/GameRequestContent;->message:Ljava/lang/String;

    return-object v0
.end method

.method public final getObjectId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 114
    iget-object v0, p0, Lcom/facebook/share/model/GameRequestContent;->objectId:Ljava/lang/String;

    return-object v0
.end method

.method public final getSuggestions()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 128
    iget-object v0, p0, Lcom/facebook/share/model/GameRequestContent;->suggestions:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/facebook/share/model/GameRequestContent;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTo()Ljava/lang/String;
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/facebook/share/model/GameRequestContent;->to:Ljava/lang/String;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 136
    iget-object v0, p0, Lcom/facebook/share/model/GameRequestContent;->message:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 137
    iget-object v0, p0, Lcom/facebook/share/model/GameRequestContent;->to:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 138
    iget-object v0, p0, Lcom/facebook/share/model/GameRequestContent;->title:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 139
    iget-object v0, p0, Lcom/facebook/share/model/GameRequestContent;->data:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 140
    invoke-virtual {p0}, Lcom/facebook/share/model/GameRequestContent;->getActionType()Lcom/facebook/share/model/GameRequestContent$ActionType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/share/model/GameRequestContent$ActionType;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 141
    invoke-virtual {p0}, Lcom/facebook/share/model/GameRequestContent;->getObjectId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 142
    invoke-virtual {p0}, Lcom/facebook/share/model/GameRequestContent;->getFilters()Lcom/facebook/share/model/GameRequestContent$Filters;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/share/model/GameRequestContent$Filters;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 143
    invoke-virtual {p0}, Lcom/facebook/share/model/GameRequestContent;->getSuggestions()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 144
    return-void
.end method
