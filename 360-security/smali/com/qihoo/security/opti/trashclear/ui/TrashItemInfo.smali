.class public Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;
.super Lcom/qihoo/security/node/BaseItemInfo;
.source "360Security"


# instance fields
.field public TrashType:I

.field public bigFileFrom:Ljava/lang/String;

.field public checkStatus:I

.field public data:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;"
        }
    .end annotation
.end field

.field public desc:Ljava/lang/String;

.field public downShadowType:I

.field public iconId:I

.field public isExpand:I

.field public keepCount:I

.field public level:I

.field public lineType:I

.field public name:Ljava/lang/String;

.field public oraginalData:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;"
        }
    .end annotation
.end field

.field public path:Ljava/lang/String;

.field public pkgName:Ljava/lang/String;

.field public rootTitle:Ljava/lang/String;

.field public size:J

.field public subCount:I

.field public systemDialogSize:J

.field public systemDialogTitle:Ljava/lang/String;

.field public upShadowType:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, -0x1

    .line 18
    invoke-direct {p0}, Lcom/qihoo/security/node/BaseItemInfo;-><init>()V

    .line 43
    const/4 v0, -0x2

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->iconId:I

    .line 71
    iput v1, p0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->TrashType:I

    .line 77
    iput v1, p0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->isExpand:I

    .line 89
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->keepCount:I

    .line 95
    iput v1, p0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->lineType:I

    .line 101
    iput v1, p0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->upShadowType:I

    .line 107
    iput v1, p0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->downShadowType:I

    return-void
.end method


# virtual methods
.method public clone()Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;
    .locals 4

    .prologue
    .line 139
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    invoke-direct {v0}, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;-><init>()V

    .line 140
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->name:Ljava/lang/String;

    iput-object v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->name:Ljava/lang/String;

    .line 141
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->rootTitle:Ljava/lang/String;

    iput-object v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->rootTitle:Ljava/lang/String;

    .line 142
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->desc:Ljava/lang/String;

    iput-object v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->desc:Ljava/lang/String;

    .line 143
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->pkgName:Ljava/lang/String;

    iput-object v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->pkgName:Ljava/lang/String;

    .line 144
    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->iconId:I

    iput v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->iconId:I

    .line 145
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->path:Ljava/lang/String;

    iput-object v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->path:Ljava/lang/String;

    .line 146
    iget-wide v2, p0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->size:J

    iput-wide v2, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->size:J

    .line 147
    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->level:I

    iput v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->level:I

    .line 148
    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    iput v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    .line 149
    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->TrashType:I

    iput v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->TrashType:I

    .line 150
    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->isExpand:I

    iput v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->isExpand:I

    .line 151
    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->subCount:I

    iput v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->subCount:I

    .line 152
    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->keepCount:I

    iput v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->keepCount:I

    .line 153
    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->lineType:I

    iput v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->lineType:I

    .line 154
    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->upShadowType:I

    iput v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->upShadowType:I

    .line 155
    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->downShadowType:I

    iput v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->downShadowType:I

    .line 156
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->bigFileFrom:Ljava/lang/String;

    iput-object v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->bigFileFrom:Ljava/lang/String;

    .line 157
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->systemDialogTitle:Ljava/lang/String;

    iput-object v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->systemDialogTitle:Ljava/lang/String;

    .line 158
    iget-wide v2, p0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->systemDialogSize:J

    iput-wide v2, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->systemDialogSize:J

    .line 159
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->data:Ljava/util/List;

    iput-object v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->data:Ljava/util/List;

    .line 162
    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .prologue
    .line 18
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->clone()Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 214
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
